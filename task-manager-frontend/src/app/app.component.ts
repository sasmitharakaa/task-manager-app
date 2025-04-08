import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';
import { StorageService } from './auth/services/storage/storage.service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  isEmployeeLoggedIn: boolean = StorageService.isEmployeeLoggedIn();
  isAdminLoggedIn: boolean = StorageService.isAdminLoggedIn();

  constructor(private router: Router){}

  ngOnInit(){
    this.router.events.subscribe(event=>{
      this.isEmployeeLoggedIn = StorageService.isEmployeeLoggedIn();
      this.isAdminLoggedIn = StorageService.isAdminLoggedIn();
    });
  }

  logout(){
    StorageService.logout();
    this.router.navigateByUrl("/login");
  }
}
