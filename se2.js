const { format } = require('date-fns');
const { v4: uuid } = require('uuid');
const path = require('path');
const fs = require('fs');
const fspromise = fs.promises;

/**
 * Logs a message to 'second/my2.txt' with timestamp and UUID
 * @param {string} message - The message to log
 */


const eventHandler = async (message) => {
  try {
    // Format current date/time: MMDDYY    HH:mm:ss
    const datetime = format(new Date(), 'MMddyy\tHH:mm:ss');

    // Prepare log line with message and UUID
    const logLine = `${datetime}\t${message}\t${uuid()}\n`;

    // Folder path
    const logDir = path.join(__dirname, 'second');

    // Create folder if it doesn't exist
    if (!fs.existsSync(logDir)) {
      await fspromise.mkdir(logDir);
    }

    // Append log line to file
    await fspromise.appendFile(path.join(logDir, 'my2.txt'), logLine);

    // Optional: print to console for debugging    
    console.log('Logged:', logLine.trim());
  } catch (err) {
    console.error('Logging error:', err);
  }
};


module.exports = eventHandler;
    