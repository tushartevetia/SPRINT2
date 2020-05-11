import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class TheaterService {

  private baseUrl = 'http://localhost:8085/lookintoTheater/showAllTheater';
  private baseUrl1='http://localhost:8085/admin/theater/addTheater';
  private baseUrl2 ='http://localhost:8085/admin/theater/deleteTheater';
  private baseUrl3='http://localhost:8085/admin/theater/UpdateTheater';
  private baseUrl4='http://localhost:8085/lookintoTheater/showTheater';

  constructor(private http: HttpClient) { }


  getTheater(theaterId: number): Observable<any> {
    return this.http.get(`${this.baseUrl4}/${theaterId}`);
  }

  createTheater(Theater: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl1}`, Theater);
  }

  updateTheater(theaterId: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl3}/${theaterId}`, value);
  }

  deleteTheater(theaterId: number): Observable<any> {
    return this.http.delete(`${this.baseUrl2}/${theaterId}`, { responseType: 'text' });
  }

  getTheaterList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
