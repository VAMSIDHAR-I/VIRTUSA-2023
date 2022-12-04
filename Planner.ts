import { Component } from '@angular/core'

@Component({
  selector: 'event-details',
  templateUrl: 'app/events-list.component.html',
  styles: [`
    th, td { font-size: 16px; padding:5px 10px;}
  `]
})
export class EventsListComponent {
  const events = [
    {name:'meetING', date: '9/26/2022', time: '10am', location: {address: 'SSE', city: 'CHENNAI', country: 'IND}},
    {name:'LUNCH', date: '4/15/2022', time: '12Pm', location: {address: 'SSE ', city: 'CHENNAI', country: 'IND'}},
    {name:'PLAY TIME', date: '4/15/2022', time: '6am', location: {address: 'SSE', city: 'CHENNAI', country: 'IND}},
   
  ]    
    
    
}