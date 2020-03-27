import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Employee } from '../model/employee';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class EmployeeService {

  private usersUrl: string;

  constructor(private http: HttpClient) {

    this.usersUrl = 'http://localhost:8080/api/v1/employee';
  }

  public findAll(): Observable<Employee[]> {
    console.log('Get all employyes');
    return this.http.get<Employee[]>(this.usersUrl);
  }

  public save(employee: Employee) {
    console.log('add some employee');
    return this.http.post<Employee>(this.usersUrl, employee);
  }

}
