int urlNumber;
		System.out.println("Enter the browser whose history you want to enter: ");
		browserName = in.next();
		System.out.println("Enter the number of urls you want to add: ");
		urlNumber = in.nextInt();
		String[] urlName= new String[urlNumber];
		
		System.out.println("Enter the URLS you want to add: ");
		for(int i=0;i<urlNumber;i++)
		{
			urlName[i] = in.next();
		}
		if(browserName.equalsIgnoreCase("Google Chrome")){
			GoogleChrome tabSix=new GoogleChrome(urlName);
			tabSix.display(urlNumber);
			return (tabSix);
		}
		
