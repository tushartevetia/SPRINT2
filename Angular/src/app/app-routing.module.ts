import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddTheaterComponent } from './add-theater/add-theater.component';
import { AllTheaterComponent } from './all-theater/all-theater.component';
import { UpdateTheaterComponent } from './update-theater/update-theater.component';
import { TheaterComponent } from './theater/theater.component';
import { ParticularTheaterComponent } from './particular-theater/particular-theater.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { MovieComponent } from './movie/movie.component';
import { AllMovieComponent } from './all-movie/all-movie.component';
import { UpdateMovieComponent } from './update-movie/update-movie.component';


const routes: Routes = [
 // {path: "", component:AddTheaterComponent},
  {path: "theater/add", component:AddTheaterComponent},
  {path: "theater/show", component: AllTheaterComponent},
  {path: "theater/update", component:UpdateTheaterComponent},
  {path: "theater", component: TheaterComponent},
 {path: "movie/add", component: AddMovieComponent},
 {path: "movie", component: MovieComponent},
 {path: "movie/show", component: AllMovieComponent},
 {path: "movie/update", component: UpdateMovieComponent},
 {path: "theater/search", component: ParticularTheaterComponent},
 
 
 
 
  //{path: "booking", component: TheaterComponent}
  {path: "theater/search", component: ParticularTheaterComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
