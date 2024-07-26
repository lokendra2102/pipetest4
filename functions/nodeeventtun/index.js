const catalyst = require("zcatalyst-sdk-node");

module.exports = (event, context) => {
	/* 
        EVENT FUNCTIONALITIES
    */
		const catalysts = catalyst.initialize(context);

		let segment = catalysts.cache().segment();
	
		segment.put("Default", JSON.stringify({
			cache_name: `ff`,
			cache_value: "jj",
			expiry_in_hours: ""
		}))
		.then(data => {
			console.log(data);
			segmentS.get("Default")
			.then(data => console.log("data ", data))
			.catch(data => {
				console.log("Error ", data)
			})
		}).catch(data => {
			console.log(data);
			// context.closeWithFailure();
		})

	/* 
        CONTEXT FUNCTIONALITIES
    */
	// context.closeWithSuccess(); //end of application with success
	// context.closeWithFailure(); //end of application with failure
};
