import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { SharedModule } from '../shared/shared.module';
import { GradeRoutingModule } from './grade-routing.module';
import { GradeComponent } from './grade/grade.component';




@NgModule({
  declarations: [
    GradeComponent
  ],
  imports: [
    CommonModule,
    GradeRoutingModule,
    AppMaterialModule,
    SharedModule
  ]
})
export class GradeModule { }
