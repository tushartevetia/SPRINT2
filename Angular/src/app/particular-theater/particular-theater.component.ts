import { Component, OnInit } from '@angular/core';
import { Theater } from '../theater';
import { ActivatedRoute, Router } from '@angular/router';
import { TheaterService } from '../theater.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-particular-theater',
  templateUrl: './particular-theater.component.html',
  styleUrls: ['./particular-theater.component.css']
})
export class ParticularTheaterComponent implements OnInit {

  theaterstatus:boolean;
  theaterId:number;
  theater: Theater;
 //Theater: Theater = new Theater();
  submitted = false;
  constructor(private theaterService: TheaterService,
    private router: Router,private route:ActivatedRoute) {}
  

  ngOnInit() {
    this.theater=new Theater();
    this.theaterstatus=false;
  }

  reloadData() {
   // this.theaterId = this.route.snapshot.params['theaterId'];
    console.log('id is '+ this.theaterId)
    this.getTheater(this.theaterId);
  }

    getTheater(theaterId: number){
   this.theaterService.getTheater(this.theaterId)
      .subscribe(data => {
        console.log(data)
        this.theaterstatus=true;
        this.theater = data;
      }, error => console.log(error));
    
  //  this.theater=this.theaterService.getTheater(this.theaterId)
    console.log(this.theater)
    
    this.gotoList();
      
  }
 
  gotoList() {
    this.router.navigate(['theater/search']);
  }
}


