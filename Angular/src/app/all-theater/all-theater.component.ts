import { Component, OnInit } from '@angular/core';
import { Theater } from '../theater';
import { Observable } from 'rxjs';
import { TheaterService } from '../theater.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all-theater',
  templateUrl: './all-theater.component.html',
  styleUrls: ['./all-theater.component.css']
})
export class AllTheaterComponent implements OnInit {

  
  Theaters: Observable<Theater[]>;

  constructor(private theaterService: TheaterService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.Theaters = this.theaterService.getTheaterList();
  }

  deleteTheater(theaterId: number) {
    this.theaterService.deleteTheater(theaterId)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  
  updateTheater(theaterId: number){
    this.router.navigate(['theater/update', theaterId]);
  }
}
