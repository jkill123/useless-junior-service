import {Employee} from "./employee";

export class Project {
  id: number;
  title: string;
  dateFrom: string;
  dateTo: string;
  type: string;
  description: string;
  employeeList: Employee[];


}
