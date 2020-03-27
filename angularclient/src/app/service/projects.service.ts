import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Employee } from '../model/employee';
import { Observable } from 'rxjs/Observable';
import {Project} from "../model/project";

@Injectable()
export class ProjectService {

  private projectsUrl: string;

  constructor(private http: HttpClient) {

    this.projectsUrl = 'http://localhost:8080/api/v1/project';
  }

  public findAllProjects(): Observable<Project[]> {
    console.log('Get all Projects');
    return this.http.get<Project[]>(this.projectsUrl);
  }
}
