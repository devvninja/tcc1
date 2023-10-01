import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Grade } from '../model/grade';
import { first, tap, delay } from 'rxjs/operators'

// Faz Injeção de Dependencia
@Injectable({
  providedIn: 'root'
})
export class GradeService {

// Caso utilize json local
//  private readonly API = 'assets/grade.json'
// Caso utilize BD no Spring - redirecionamento
  private readonly API = 'api/grade'


  constructor(private httpClient: HttpClient) { }

  // Lista (get - pega dado)
  // Observable de Objeto que retorna um Array da Grade
  list() {
    return this.httpClient.get<Grade[]>(this.API)
    .pipe(  // Log para verificar o funcionamento - (para debug)
    first(), // Assim que obter a primeira resposta, faz o Unsubscrible
    delay(2000),
      tap(grade => console.log(grade))
    );
  }
}
