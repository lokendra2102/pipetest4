'use strict';
import Cliq from 'zcatalyst-integ-cliq';
import catalyst from 'zcatalyst-sdk-node';

export default async (request, response) => {
	try {
		console.log("LOKI");
		const app = catalyst.initialize(request);
		const handlerResponse = await Cliq.execute(request, app);
		// handlerResponse.then(data => {
			// 	console.log(data)
			// })
		// handlerResponse.responseBody = {
		// 	text : "LOKI"
		// }
		console.log(handlerResponse);
		// console.log(request);
		// console.log(handlerResponse);
		// console.log(handlerResponse);
		// console.log(handlerResponse.buildResponse()["responseBody"]);
		// console.log(JSON.parse(handlerResponse.buildResponse()["responseBody"]));
		// console.log(JSON.stringify(JSON.parse(handlerResponse.buildResponse()["responseBody"])));
		// response.setHeader('Content-Type', 'application/json');
		// console.log(request);
		// console.log(response);
		response.end(handlerResponse);
	} catch (err) {
		console.log('Error while executing handler. ', err);
		throw err;
	}
};
