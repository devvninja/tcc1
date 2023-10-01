import { GradeService } from './../services/grade.service';
import { Component, OnInit } from '@angular/core';
import { Grade } from '../model/grade';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { MatDialog } from '@angular/material/dialog';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';


@Component({
  selector: 'app-grade',
  templateUrl: './grade.component.html',
  styleUrls: ['./grade.component.scss']
})
export class GradeComponent implements OnInit {

  grade$: Observable<Grade[]>;
  displayedColumns = ['id','name','cidade'];

  //gradeService: GradeService;

  constructor(
    private gradeService: GradeService,
    public dialog: MatDialog
  ) {
    // this.grade = [];
    //this.gradeService = new GradeService();
    this.grade$ = this.gradeService.list()
    // Tratamento de Erro
    .pipe(
      catchError( error => {
        this.onError('Erro ao carregar a Lista.');
        return of([])
      })
    );

  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg,
    });
  }

  ngOnInit(): void {


  }

}
