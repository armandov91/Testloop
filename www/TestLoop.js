var exec = require('cordova/exec');

module.exports.startLoop = function (arg0, success, error) {
    exec(success, error, 'TestLoop', 'startLoop', [arg0]);
};

module.exports.clearLoop = function (arg0, success, error) {
    exec(success, error, 'TestLoop', 'clearLoop', [arg0]);
};
