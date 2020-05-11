import { Component, OnInit } from '@angular/core';
import { Movie } from '../movie';
import { Router } from '@angular/router';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})

export class AddMovieComponent implements OnInit {

    Movie: Movie = new Movie();
  submitted = false;

  constructor(private MovieService: MovieService,
    private router: Router) { }
  

  ngOnInit(){

  }
  newMovie(): void {
    this.submitted = false;
    this.Movie = new Movie();
  }

  save() {
    this.MovieService.createMovie(this.Movie)
      .subscribe(data => console.log(data), error => console.log(error));
    this.Movie = new Movie();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['movie/add']);
  }

}
