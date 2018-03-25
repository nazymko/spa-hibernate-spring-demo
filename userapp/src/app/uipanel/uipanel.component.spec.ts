import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UipanelComponent } from './uipanel.component';

describe('UipanelComponent', () => {
  let component: UipanelComponent;
  let fixture: ComponentFixture<UipanelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UipanelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UipanelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
