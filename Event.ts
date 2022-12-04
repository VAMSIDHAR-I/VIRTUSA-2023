import { Component } from '@angular/core'

@Component({
  selector: 'event-details',
  templateUrl: 'app/event-details.component.html'
})
export class EventDetailsComponent {
  const event = {name:'vamsi', date: '3/1/2022', time: '8am', location: {address: '1SSE', city: 'CHENNAI,TN', country: 'IND'}}
}