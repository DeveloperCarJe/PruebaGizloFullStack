import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const API_BASE = `http://192.168.0.106:8080/api/v1`
@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(
    private http: HttpClient
  ) { }

  getAll(){
    return this.http.get(`${API_BASE}/usuarios`)
  }

  create(usuario: any){
    return this.http.post(`${API_BASE}/usuarios`,usuario);
  }

  update(codigo: string, usuario:any){
    return this.http.put(`${API_BASE}/usuarios/${codigo}`,usuario);
  }
  delete(codigo: string){
    return this.http.delete(`${API_BASE}/usuarios/${codigo}`);
  }
}
