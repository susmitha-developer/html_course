const fs = require('fs');
const fsPromises = require('fs').promises;
const path = require('path');

const logEvents = async (message, logFileName) => {
    try {
        if (!fs.existsSync(path.join(__dirname, 'logs'))) {
            await fsPromises.mkdir(path.join(__dirname, 'logs'));
        }

        const logItem = `${new Date().toISOString()}\t${message}\n`;

        await fsPromises.appendFile(
            path.join(__dirname, 'logs', logFileName),
            logItem
        );
    } catch (err) {
        console.error(err);
    }
};

module.exports = logEvents;
