	package kraftbike.api.bike.controller;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import rx.Observable;

@RestController
public class ReactiveTimeController {
	@RequestMapping("/timereact")
	public DeferredResult<String> getTimeAsync() {
		Observable<String> observable = this.getTime();
		DeferredResult<String> deffered = new DeferredResult<>();
		observable.subscribe(result -> deffered.setResult(result), error -> deffered.setErrorResult(error));
		return deffered;
	}

	public Observable<String> getTime() {
		return Observable.just(DateTime.now().toString());
	}
}