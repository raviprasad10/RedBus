Feature: RedBus Ticket Booking

Scenario: Booking the ticket
Given user is on RedBus home page
When user enters the source, destination,onward date and return date
And clicks on search Buses
Then user is able to see all the available buses
When user selects the "Venkatesh Tours & Travels" and checks for seat availability
Then user selects the seat and proceeds for payment



Scenario: Register with all the details

Given Open Naukri
When User enter all the required fields 
Then User should be registered successfully