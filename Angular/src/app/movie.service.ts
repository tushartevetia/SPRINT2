import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Theater } from './theater';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  private baseUrl = 'http://localhost:8085/lookintoTheater/showAllMovies';
  private baseUrl1='http://localhost:8085/admin/movies/addMovie';
  private baseUrl2 ='http://localhost:8085/admin/movies/deleteMovie';
 // private baseUrl3='http://localhost:8085/admin/theater/UpdateTheater';
  private baseUrl4='http://localhost:8085/lookintoTheater/showMovie';

  constructor(private http: HttpClient) { }


  getMovie(movieId: number): Observable<any> {
    return this.http.get(`${this.baseUrl4}/${movieId}`);
  }

  createMovie(Movie: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl1}`, Movie);
  }

 // updateMovie(movieId: number, value: any): Observable<Object> {
    //return this.http.put(`${this.baseUrl3}/${movieId}`, value);
  //}

  deleteMovie(movieId: number): Observable<any> {
    return this.http.delete(`${this.baseUrl2}/${movieId}`, { responseType: 'text' });
  }

  getMovieList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}

