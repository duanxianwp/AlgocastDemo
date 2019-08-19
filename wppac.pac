function FindProxyForURL(url, host) {
	
   if (host=="music.163.com"|| host == "interface.music.163.com") {
   	return "PROXY 116.62.7.98:10163"
   }
    return "DIRECT";
}
