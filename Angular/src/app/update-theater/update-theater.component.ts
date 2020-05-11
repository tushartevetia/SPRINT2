import { Component, OnInit } from '@angular/core';
import { Theater } from '../theater';
import { ActivatedRoute, Router } from '@angular/router';
import { TheaterService } from '../theater.service';

@Component({
  selector: 'app-update-theater',
  templateUrl: './update-theater.component.html',
  styleUrls: ['./update-theater.component.css']
})
export class UpdateTheaterComponent implements OnInit {
  theaterId:number;
  Theater:Theater;


  constructor(private route:ActivatedRoute,private router:Router, private TheaterService:TheaterService) { }

  ngOnInit() {
    this.Theater=new Theater();
    this.theaterId=this.route.snapshot.params['theaterId'];
    this.TheaterService.getTheater(this.theaterId)
    .subscribe(data => {
      console.log(data)
      this.Theater = data;
    }, error => console.log(error));
}

updateTest() {
  this.TheaterService.updateTheater(this.theaterId, this.Theater)
    .subscribe(data => console.log(data), error => console.log(error));
  this.Theater = new Theater();
  this.gotoList();
}

onSubmit() {
  this.updateTest();    
}

gotoList() {
  this.router.navigate(['theater/update']);
}
}
