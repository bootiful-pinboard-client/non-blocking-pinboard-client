# A Reactive Pinboard Client

![CI](https://github.com/bootiful-pinboard-client/non-blocking-pinboard-client/workflows/CI/badge.svg)

## Reactive Spring Webflux Applications 

The `pinboard.webclient.WebClientPinboardClient` is a client based on the reactive Spring `WebClient`. This uses asynchronous, non-blocking I/O, based on Netty. This is a more natural fit in a reactive application. If you can, choose this one first for your next reactive application.

``` 
String myPinboardAccessToken = "...";
new pinboard.webclient.WebClientPinboardClient(myPinboardAccessToken);
```
