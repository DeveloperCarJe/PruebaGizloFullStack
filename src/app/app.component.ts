import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  usuarios: any[] = [];
  usuario = {
    codigo:null,
    nombre:'',
    apellido:'',
    email:'',
    edad:''
  }

  constructor(
    private appService: AppService
  ){

  }
  ngOnInit(): void {
    this.getAll();
  }
  getAll(){
    this.appService.getAll()
    .subscribe((data: any) => this.usuarios = data);
  }

  save(){
    if (this.usuario.codigo){
      this.appService.update(this.usuario.codigo, this.usuario)
      .subscribe(()=> this.getAll());
    }else{
      this.appService.create(this.usuario)
      .subscribe(()=> this.getAll());
    }
    this.usuario = {
      codigo:null,
      nombre:'',
      apellido:'',
      email:'',
      edad:''
    }
  }

  edit(usuario: any){
    this.usuario = usuario;
  }

  delete(usuario: any){
    this.appService.delete(usuario.codigo)
    .subscribe(()=> this.getAll());
  }
}
