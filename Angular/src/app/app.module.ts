import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddTheaterComponent } from './add-theater/add-theater.component';
import { AllTheaterComponent } from './all-theater/all-theater.component';
import { UpdateTheaterComponent } from './update-theater/update-theater.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from "@angular/forms";
import { TheaterComponent } from './theater/theater.component';
import { ParticularTheaterComponent } from './particular-theater/particular-theater.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { AllMovieComponent } from './all-movie/all-movie.component';
import { ParticularMovieComponent } from './particular-movie/particular-movie.component';
import { UpdateMovieComponent } from './update-movie/update-movie.component';
import { MovieComponent } from './movie/movie.component';
@NgModule({
  declarations: [
    AppComponent,
    AddTheaterComponent,
    AllTheaterComponent,
    UpdateTheaterComponent,
    TheaterComponent,
    ParticularTheaterComponent,
    AddMovieComponent,
    AllMovieComponent,
    ParticularMovieComponent,
    UpdateMovieComponent,
    MovieComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
