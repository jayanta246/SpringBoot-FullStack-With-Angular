import { Injectable } from '@angular/core';
import {HttpClient, HttpClientModule} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Employee } from '../interfaces/employee';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private apuUrl =environment.apiBaseUrl;

  constructor(private http:HttpClient) { }

  public getEmployee():Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.apuUrl}/api/v1/employee/all`);
  }

  public addEmployee(employee:Employee):Observable<Employee>{
    return this.http.post<Employee>(`${this.apuUrl}/api/v1/employee/add`,employee);
  }

  public updateEmployee(employee:Employee):Observable<Employee>{
    return this.http.put<Employee>(`${this.apuUrl}/api/v1/employee/update`,employee);
  }

  public deleteEmployee(employeeId:number):Observable<void>{
    return this.http.delete<void>(`${this.apuUrl}/api/v1/employee/delete/${employeeId}`);
  }

  public findEmployee(employeeId:number):Observable<Employee>{
    return this.http.get<Employee>(`${this.apuUrl}/api/v1/employee/${employeeId}`);
  }


}
