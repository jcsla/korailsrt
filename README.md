### korailsrt
Korail (www.letskorail.com) wrapper for Kotlin.

This project was inspired from  [korail2](https://github.com/carpedm20/korail2) of [carpedm20](https://github.com/carpedm20).

### Download
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}

dependencies {
	        implementation 'com.github.jcsla:korailsrt:a43323d7d2'
}
```

### Usage ###
#### 1. Login ####
```
Korail.login("enter your korail membership id", "enter your password")
```
#### 2. Search train what you wanna take ####
```
val searchTrainResult =
              Korail.searchTrain(date = "20200122",
                                 time = "192500",
                                 trainType = TrainType.ALL.value,
                                 adultCount = "1")
```
#### 3. Reserve train what you searched before in Section 2 ####
```
val reserveTicketResult =
              Korail.reserveTicket(searchTrainResult.trn_infos.trn_info.first())
```

### Author
Jun-Young Lee / [@jcsla](https://github.com/jcsla)
