const eventHandler = require('./se2'); // Replace with actual filename
const EventEmitter = require('events');

class MyEmitter extends EventEmitter {}
const myEmitter = new MyEmitter();

myEmitter.on('log', (msg) => {
    eventHandler(msg);
});

myEmitter.emit('log', 'event emitted for second folder log file');
