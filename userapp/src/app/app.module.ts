import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { DepartmentComponent } from './department/department.component';
import { UipanelComponent } from './uipanel/uipanel.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    DepartmentComponent,
    UipanelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
