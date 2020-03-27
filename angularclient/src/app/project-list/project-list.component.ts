import {Component, OnInit} from '@angular/core';
import {ProjectService} from "../service/projects.service";
import {Project} from "../model/project";

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.css']
})
export class ProjectListComponent implements OnInit {

  projects: Project[];

  constructor(private projectService: ProjectService) {
  }

  ngOnInit() {
    this.projectService.findAllProjects().subscribe(data => {
      this.projects = data;
    });
  }
}
