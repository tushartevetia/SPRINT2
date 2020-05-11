import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../movie';
import { MovieService } from '../movie.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all-movie',
  templateUrl: './all-movie.component.html',
  styleUrls: ['./all-movie.component.css']
})
export class AllMovieComponent implements OnInit {

  Movies: Observable<Movie[]>;

  constructor(private movieService: MovieService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
    this.Movies = this.movieService.getMovieList();
  }

  deleteMovie(movieId: number) {
    this.movieService.deleteMovie(movieId)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  
  updateMovie(movieId: number){
    this.router.navigate(['movie/update', movieId]);
  }

}
