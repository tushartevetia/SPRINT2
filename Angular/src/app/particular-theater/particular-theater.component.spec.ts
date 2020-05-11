import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParticularTheaterComponent } from './particular-theater.component';

describe('ParticularTheaterComponent', () => {
  let component: ParticularTheaterComponent;
  let fixture: ComponentFixture<ParticularTheaterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParticularTheaterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParticularTheaterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
