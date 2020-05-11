import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Theater } from '../theater';
import { TheaterService } from '../theater.service';

@Component({
  selector: 'app-add-theater',
  templateUrl: './add-theater.component.html',
  styleUrls: ['./add-theater.component.css']
})
export class AddTheaterComponent implements OnInit {

  Theater: Theater = new Theater();
  submitted = false;

  constructor(private TheaterService: TheaterService,
    private router: Router) { }

  ngOnInit() {
  }

  newTheater(): void {
    this.submitted = false;
    this.Theater = new Theater();
  }

  save() {
    this.TheaterService.createTheater(this.Theater)
      .subscribe(data => console.log(data), error => console.log(error));
    this.Theater = new Theater();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['theater/add']);
  }
}