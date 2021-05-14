%napadi i simptomi i ucestalost njihovog koriscenja-----------------------------

%counterfeit-websites
attacksymptomslist(counterfeit-websites, [suspicious_conversation_email,suspicious_link,suspicious_website,credentials_theft]).

attack(counterfeit-websites, update, 12).
attack(counterfeit-websites, suspicious-conversation-email, 89).
attack(counterfeit-websites, app-download, 17).
attack(counterfeit-websites, ad-click, 11).
attack(counterfeit-websites, ad-blocker-deactivation, 3).
attack(counterfeit-websites, suspicious-link, 96).
attack(counterfeit-websites, suspicious-website, 100).
attack(counterfeit-websites, pop-up-windows, 23).
attack(counterfeit-websites, credential-re-entering, 22).
attack(counterfeit-websites, services-fail, 25).
attack(counterfeit-websites, credentials-theft, 92).
attack(counterfeit-websites, frequents-spams, 57).
attack(counterfeit-websites, company-size-1-250,78).
attack(counterfeit-websites, company-size-250-500,85).
attack(counterfeit-websites, company-size-500-1000,80).
attack(counterfeit-websites, company-size-1000,70).
attack(counterfeit-websites, company-sector-hospital, 46).
attack(counterfeit-websites, company-sector-finance, 89).
attack(counterfeit-websites, company-sector-technology,83).
attack(counterfeit-websites, company-sector-business-and-professional-service,64).
attack(counterfeit-websites, company-sector-retail-and-manifacturing,62).
attack(counterfeit-websites, company-sector-logistics-and-transportation,57).
attack(counterfeit-websites, europe, 87).
attack(counterfeit-websites, north-america, 88).
attack(counterfeit-websites, south-america, 74).
attack(counterfeit-websites, australia, 86).
attack(counterfeit-websites, asia, 85).
attack(counterfeit-websites, africa, 22).

%pharming
attacksymptomslist(pharming, [suspicious-link,suspicious-website,credential-re-entering,credentials-theft,virus-detection]).

attack(pharming, update, 16).
attack(pharming, suspicious-conversation-email, 63).
attack(pharming, app-download, 19).
attack(pharming, ad-click, 15).
attack(pharming, ad-blocker-deactivation, 3).
attack(pharming, suspicious-link, 97).
attack(pharming, suspicious-website, 95).
attack(pharming, pop-up-windows, 23).
attack(pharming, credential-re-entering, 75).
attack(pharming, services-fail, 29).
attack(pharming, credentials-theft, 72).
attack(pharming, frequents-spams, 47).
attack(pharming, virus-detection, 83).
attack(pharming, company-size-1-250,78).
attack(pharming, company-size-250-500,85).
attack(pharming, company-size-500-1000,80).
attack(pharming, company-size-1000,70).
attack(pharming, company-sector-hospital, 46).
attack(pharming, company-sector-finance, 98).
attack(pharming, company-sector-technology,80).
attack(pharming, company-sector-business-and-professional-service,68).
attack(pharming, company-sector-retail-and-manifacturing,65).
attack(pharming, company-sector-logistics-and-transportation,53).
attack(pharming, europe, 89).
attack(pharming, north-america, 87).
attack(pharming, south-america, 73).
attack(pharming, australia, 85).
attack(pharming, asia, 84).
attack(pharming, africa, 22).

%spear-phishing
attacksymptomslist(spear-phishing, [suspicious-conversation-email,suspicious-link,suspicious-website,credentials-theft,frequents-spams]).

attack(spear-phishing, update, 19).
attack(spear-phishing, suspicious-conversation-phone-call, 5).
attack(spear-phishing, suspicious-conversation-phone-message, 5).
attack(spear-phishing, suspicious-conversation-email, 100).
attack(spear-phishing, suspicious-conversation-visit, 30).
attack(spear-phishing, app-download, 23).
attack(spear-phishing, suspicious-link, 97).
attack(spear-phishing, suspicious-website, 89).
attack(spear-phishing, credential-re-entering, 26).
attack(spear-phishing, credentials-theft, 98).
attack(spear-phishing, frequents-spams, 72).
attack(spear-phishing, company-size-1-250,87).
attack(spear-phishing, company-size-250-500,90).
attack(spear-phishing, company-size-500-1000,93).
attack(spear-phishing, company-size-1000,86).
attack(spear-phishing, company-sector-hospital,25).
attack(spear-phishing, company-sector-finance,89).
attack(spear-phishing, company-sector-technology,83).
attack(spear-phishing, company-sector-business-and-professional-service,78).
attack(spear-phishing, company-sector-retail-and-manifacturing,37).
attack(spear-phishing, company-sector-logistics-and-transportation,38).
attack(spear-phishing, europe, 79).
attack(spear-phishing, north-america, 86).
attack(spear-phishing, south-america, 78).
attack(spear-phishing, australia, 89).
attack(spear-phishing, asia, 88).
attack(spear-phishing, africa, 29).

%mobile-phishing
attacksymptomslist(mobile-phishing, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-link,credentials-theft,frequents-spams]).

attack(mobile-phishing, update, 7).
attack(mobile-phishing, suspicious-conversation-phone-call, 100).
attack(mobile-phishing, suspicious-conversation-phone-message, 100).
attack(mobile-phishing, suspicious-conversation-email, 49).
attack(mobile-phishing, app-download, 18).
attack(mobile-phishing, ad-click, 9).
attack(mobile-phishing, ad-blocker-deactivation, 4).
attack(mobile-phishing, suspicious-link, 99).
attack(mobile-phishing, pop-up-windows, 10).
attack(mobile-phishing, credential-re-entering, 7).
attack(mobile-phishing, credentials-theft, 99).
attack(mobile-phishing, frequents-spams, 73).
attack(mobile-phishing, company-size-1-250,87).
attack(mobile-phishing, company-size-250-500,90).
attack(mobile-phishing, company-size-500-1000,93).
attack(mobile-phishing, company-size-1000,84).
attack(mobile-phishing, company-sector-hospital,44).
attack(mobile-phishing, company-sector-finance,88).
attack(mobile-phishing, company-sector-technology,76).
attack(mobile-phishing, company-sector-business-and-professional-service,70).
attack(mobile-phishing, company-sector-retail-and-manifacturing,63).
attack(mobile-phishing, company-sector-logistics-and-transportation,49).
attack(mobile-phishing, europe, 79).
attack(mobile-phishing, north-america, 83).
attack(mobile-phishing, south-america, 70).
attack(mobile-phishing, australia, 85).
attack(mobile-phishing, asia, 87).
attack(mobile-phishing, africa, 28).

%voice-phishing
attacksymptomslist(voice-phishing, [suspicious-conversation-phone-call,credentials-theft,frequents-spams]).

attack(voice-phishing, suspicious-conversation-phone-call, 100).
attack(voice-phishing, app-download, 5).
attack(voice-phishing, ad-click, 4).
attack(voice-phishing, ad-blocker-deactivation, 4).
attack(voice-phishing, suspicious-link, 4).
attack(voice-phishing, pop-up-windows, 6).
attack(voice-phishing, credential-re-entering, 7).
attack(voice-phishing, credentials-theft, 99).
attack(voice-phishing, frequents-spams, 79).
attack(voice-phishing, company-size-1-250,88).
attack(voice-phishing, company-size-250-500,90).
attack(voice-phishing, company-size-500-1000,93).
attack(voice-phishing, company-size-1000,84).
attack(voice-phishing, company-sector-hospital,43).
attack(voice-phishing, company-sector-finance,87).
attack(voice-phishing, company-sector-technology,75).
attack(voice-phishing, company-sector-business-and-professional-service,75).
attack(voice-phishing, company-sector-retail-and-manifacturing,69).
attack(voice-phishing, company-sector-logistics-and-transportation,48).
attack(voice-phishing, europe, 79).
attack(voice-phishing, north-america, 83).
attack(voice-phishing, south-america, 70).
attack(voice-phishing, australia, 85).
attack(voice-phishing, asia, 87).
attack(voice-phishing, africa, 28).

%typo-squatting
attacksymptomslist(typo-squatting, [suspicious-conversation-email,suspicious-link,suspicious-website,credentials-theft,frequents-spams]).

attack(typo-squatting, update, 14).
attack(typo-squatting, suspicious-conversation-email, 87).
attack(typo-squatting, ad-click, 16).
attack(typo-squatting, ad-blocker-deactivation, 3).
attack(typo-squatting, suspicious-link, 100).
attack(typo-squatting, pop-up-windows, 23).
attack(typo-squatting, suspicious-website, 90).
attack(typo-squatting, credential-re-entering, 7).
attack(typo-squatting, credentials-theft, 90).
attack(typo-squatting, frequents-spams, 84).
attack(typo-squatting, company-size-1-250,89).
attack(typo-squatting, company-size-250-500,95).
attack(typo-squatting, company-size-500-1000,93).
attack(typo-squatting, company-size-1000,89).
attack(typo-squatting, company-sector-hospital, 61).
attack(typo-squatting, company-sector-finance, 79).
attack(typo-squatting, company-sector-technology, 85).
attack(typo-squatting, company-sector-business-and-professional-service, 77).
attack(typo-squatting, company-sector-retail-and-manifacturing,62).
attack(typo-squatting, company-sector-logistics-and-transportation,53).
attack(typo-squatting, europe, 78).
attack(typo-squatting, north-america, 92).
attack(typo-squatting, south-america, 67).
attack(typo-squatting, australia, 89).
attack(typo-squatting, asia, 81).
attack(typo-squatting, africa, 30).

%sound-squatting
attacksymptomslist(sound-squatting, [suspicious-conversation-email,suspicious-link,suspicious-website,credentials-theft,frequents-spams]).

attack(sound-squatting, update, 13).
attack(sound-squatting, suspicious-conversation-email, 71).
attack(sound-squatting, ad-click, 15).
attack(sound-squatting, ad-blocker-deactivation, 4).
attack(sound-squatting, suspicious-link, 100).
attack(sound-squatting, pop-up-windows, 24).
attack(sound-squatting, suspicious-website, 95).
attack(sound-squatting, credential-re-entering, 8).
attack(sound-squatting, credentials-theft, 90).
attack(sound-squatting, frequents-spams, 82).
attack(sound-squatting, company-size-1-250,88).
attack(sound-squatting, company-size-250-500,93).
attack(sound-squatting, company-size-500-1000,92).
attack(sound-squatting, company-size-1000,87).
attack(sound-squatting, company-sector-hospital, 61).
attack(sound-squatting, company-sector-finance, 79).
attack(sound-squatting, company-sector-technology, 86).
attack(sound-squatting, company-sector-business-and-professional-service, 77).
attack(sound-squatting, company-sector-retail-and-manifacturing,62).
attack(sound-squatting, company-sector-logistics-and-transportation,58).
attack(sound-squatting, europe, 79).
attack(sound-squatting, north-america, 90).
attack(sound-squatting, south-america, 69).
attack(sound-squatting, australia, 85).
attack(sound-squatting, asia, 80).
attack(sound-squatting, africa, 31).

%homograph-attack-via-homoglyphs
attacksymptomslist(homograph-attack-via-homoglyphs, [suspicious-conversation-email,suspicious-link,suspicious-website,credentials-theft,frequents-spams]).

attack(homograph-attack-via-homoglyphs, update, 12).
attack(homograph-attack-via-homoglyphs, suspicious-conversation-email, 71).
attack(homograph-attack-via-homoglyphs, ad-click, 13).
attack(homograph-attack-via-homoglyphs, ad-blocker-deactivation, 4).
attack(homograph-attack-via-homoglyphs, suspicious-link, 97).
attack(homograph-attack-via-homoglyphs, pop-up-windows, 26).
attack(homograph-attack-via-homoglyphs, suspicious-website, 96).
attack(homograph-attack-via-homoglyphs, credential-re-entering, 9).
attack(homograph-attack-via-homoglyphs, credentials-theft, 92).
attack(homograph-attack-via-homoglyphs, frequents-spams, 84).
attack(homograph-attack-via-homoglyphs, company-size-1-250,89).
attack(homograph-attack-via-homoglyphs, company-size-250-500,94).
attack(homograph-attack-via-homoglyphs, company-size-500-1000,90).
attack(homograph-attack-via-homoglyphs, company-size-1000,88).
attack(homograph-attack-via-homoglyphs, company-sector-hospital, 62).
attack(homograph-attack-via-homoglyphs, company-sector-finance, 78).
attack(homograph-attack-via-homoglyphs, company-sector-technology, 88).
attack(homograph-attack-via-homoglyphs, company-sector-business-and-professional-service, 76).
attack(homograph-attack-via-homoglyphs, company-sector-retail-and-manifacturing,61).
attack(homograph-attack-via-homoglyphs, company-sector-logistics-and-transportation,59).
attack(homograph-attack-via-homoglyphs, europe, 78).
attack(homograph-attack-via-homoglyphs, north-america, 91).
attack(homograph-attack-via-homoglyphs, south-america, 68).
attack(homograph-attack-via-homoglyphs, australia, 84).
attack(homograph-attack-via-homoglyphs, asia, 81).
attack(homograph-attack-via-homoglyphs, africa, 28).

%bit-squatting
attacksymptomslist(bit-squatting, [suspicious-conversation-email,suspicious-link,suspicious-website,credentials-theft,frequents-spams]).

attack(bit-squatting, update, 10).
attack(bit-squatting, suspicious-conversation-email, 84).
attack(bit-squatting, ad-click, 14).
attack(bit-squatting, ad-blocker-deactivation, 3).
attack(bit-squatting, suspicious-link, 100).
attack(bit-squatting, pop-up-windows, 22).
attack(bit-squatting, suspicious-website, 93).
attack(bit-squatting, credential-re-entering, 9).
attack(bit-squatting, credentials-theft, 92).
attack(bit-squatting, frequents-spams, 84).
attack(bit-squatting, company-size-1-250,84).
attack(bit-squatting, company-size-250-500,94).
attack(bit-squatting, company-size-500-1000,92).
attack(bit-squatting, company-size-1000,88).
attack(bit-squatting, company-sector-hospital, 60).
attack(bit-squatting, company-sector-finance, 77).
attack(bit-squatting, company-sector-technology, 87).
attack(bit-squatting, company-sector-business-and-professional-service, 79).
attack(bit-squatting, company-sector-retail-and-manifacturing,67).
attack(bit-squatting, company-sector-logistics-and-transportation,55).
attack(bit-squatting, europe, 82).
attack(bit-squatting, north-america, 90).
attack(bit-squatting, south-america, 69).
attack(bit-squatting, australia, 87).
attack(bit-squatting, asia, 79).
attack(bit-squatting, africa, 28).


%pretexting-via-customer-service
attacksymptomslist(pretexting-via-customer-service, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,ad-click,pop-up-windows,credentials-theft]).

attack(pretexting-via-customer-service, suspicious-conversation-phone-call, 87).
attack(pretexting-via-customer-service, suspicious-conversation-phone-message, 98).
attack(pretexting-via-customer-service, suspicious-conversation-email, 76).
attack(pretexting-via-customer-service, ad-click, 86).
attack(pretexting-via-customer-service, pop-up-windows, 82).
attack(pretexting-via-customer-service, credentials-theft, 83).
attack(pretexting-via-customer-service, company-size-1-250,92).
attack(pretexting-via-customer-service, company-size-250-500,87).
attack(pretexting-via-customer-service, company-size-500-1000,57).
attack(pretexting-via-customer-service, company-size-1000,75).
attack(pretexting-via-customer-service, company-sector-hospital,52).
attack(pretexting-via-customer-service, company-sector-finance,2).
attack(pretexting-via-customer-service, company-sector-technology,23).
attack(pretexting-via-customer-service, company-sector-business-and-professional-service,53).
attack(pretexting-via-customer-service, company-sector-retail-and-manifacturing,76).
attack(pretexting-via-customer-service, company-sector-logistics-and-transportation,23).
attack(pretexting-via-customer-service, europe, 35).
attack(pretexting-via-customer-service, north-america, 87).
attack(pretexting-via-customer-service, south-america, 12).
attack(pretexting-via-customer-service, australia, 93).
attack(pretexting-via-customer-service, asia, 75).
attack(pretexting-via-customer-service, africa, 7).


%dns-domain-seizure
attacksymptomslist(dns-domain-seizure, [credential-re-entering,services-fail,credentials-theft,suspicious-code-modifications]).

attack(dns-domain-seizure, credential-re-entering, 79).
attack(dns-domain-seizure, services-fail, 99).
attack(dns-domain-seizure, credentials-theft, 83).
attack(dns-domain-seizure, suspicious-code-modifications, 73).
attack(dns-domain-seizure, company-size-1-250, 11).
attack(dns-domain-seizure, company-size-250-500, 7).
attack(dns-domain-seizure, company-size-500-1000, 37).
attack(dns-domain-seizure, company-size-1000,75).
attack(dns-domain-seizure, company-sector-hospital, 52).
attack(dns-domain-seizure, company-sector-finance,88).
attack(dns-domain-seizure, company-sector-technology, 23).
attack(dns-domain-seizure, company-sector-business-and-professional-service,73).
attack(dns-domain-seizure, company-sector-retail-and-manifacturing,48).
attack(dns-domain-seizure, company-sector-logistics-and-transportation, 89).
attack(dns-domain-seizure, europe, 53).
attack(dns-domain-seizure, north-america, 87).
attack(dns-domain-seizure, south-america, 12).
attack(dns-domain-seizure, australia, 76).
attack(dns-domain-seizure, asia, 75).
attack(dns-domain-seizure, africa, 17).


%influence-via-incentives
attacksymptomslist(influence-via-incentives, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,suspicious-conversation-visit,bribery,suspicious-link,credentials-theft]).


attack(influence-via-incentives, suspicious-conversation-phone-call, 97).
attack(influence-via-incentives, suspicious-conversation-phone-message, 98).
attack(influence-via-incentives, suspicious-conversation-email, 91).
attack(influence-via-incentives, suspicious-conversation-visit, 85).
attack(influence-via-incentives, bribery, 70).
attack(influence-via-incentives, suspicious-link, 89).
attack(influence-via-incentives, credentials-theft, 83).
attack(influence-via-incentives, company-size-1-250, 65).
attack(influence-via-incentives, company-size-250-500, 17).
attack(influence-via-incentives, company-size-500-1000,37).
attack(influence-via-incentives, company-size-1000,5).
attack(influence-via-incentives, company-sector-hospital, 2).
attack(influence-via-incentives, company-sector-finance,8).
attack(influence-via-incentives, company-sector-technology, 43).
attack(influence-via-incentives, company-sector-business-and-professional-service,83).
attack(influence-via-incentives, company-sector-retail-and-manifacturing,78).
attack(influence-via-incentives, company-sector-logistics-and-transportation, 39).
attack(influence-via-incentives, europe, 53).
attack(influence-via-incentives, north-america, 87).
attack(influence-via-incentives, south-america, 12).
attack(influence-via-incentives, australia, 76).
attack(influence-via-incentives, asia, 75).
attack(influence-via-incentives, africa, 17).


%harvesting-information-via-api-event-monitoring
attacksymptomslist(harvesting-information-via-api-event-monitoring, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-visit,app-download,credential-re-entering,credentials-theft,frequents-spams]).

attack(harvesting-information-via-api-event-monitoring, suspicious-conversation-phone-call, 98).
attack(harvesting-information-via-api-event-monitoring, suspicious-conversation-phone-message, 84).
attack(harvesting-information-via-api-event-monitoring, suspicious-conversation-visit, 79).
attack(harvesting-information-via-api-event-monitoring, app-download, 70).
attack(harvesting-information-via-api-event-monitoring, credential-re-entering, 79).
attack(harvesting-information-via-api-event-monitoring, credentials-theft, 81).
attack(harvesting-information-via-api-event-monitoring, frequents-spams, 71).
attack(harvesting-information-via-api-event-monitoring, company-size-1-250, 56).
attack(harvesting-information-via-api-event-monitoring, company-size-250-500, 73).
attack(harvesting-information-via-api-event-monitoring, company-size-500-1000,13).
attack(harvesting-information-via-api-event-monitoring, company-size-1000,75).
attack(harvesting-information-via-api-event-monitoring, company-sector-hospital, 32).
attack(harvesting-information-via-api-event-monitoring, company-sector-finance,58).
attack(harvesting-information-via-api-event-monitoring, company-sector-technology, 73).
attack(harvesting-information-via-api-event-monitoring, company-sector-business-and-professional-service,71).
attack(harvesting-information-via-api-event-monitoring, company-sector-retail-and-manifacturing,35).
attack(harvesting-information-via-api-event-monitoring, company-sector-logistics-and-transportation, 9).
attack(harvesting-information-via-api-event-monitoring, europe, 77).
attack(harvesting-information-via-api-event-monitoring, north-america, 87).
attack(harvesting-information-via-api-event-monitoring, south-america, 92).
attack(harvesting-information-via-api-event-monitoring, australia, 72).
attack(harvesting-information-via-api-event-monitoring, asia, 15).
attack(harvesting-information-via-api-event-monitoring, africa, 98).

%flash-file-overlay
attacksymptomslist(flash-file-overlay, [suspicious-conversation-email, ad-click,suspicious-link,credentials-theft,frequents-spams]).

attack(flash-file-overlay, update, 2).
attack(flash-file-overlay, suspicious-conversation-phone-call, 3).
attack(flash-file-overlay, suspicious-conversation-phone-message, 15).
attack(flash-file-overlay, suspicious-conversation-email, 93).
attack(flash-file-overlay, suspicious-conversation-visit, 1).
attack(flash-file-overlay, app-download, 3).
attack(flash-file-overlay, ad-click, 91).
attack(flash-file-overlay, ad-blocker-deactivation, 44).
attack(flash-file-overlay, suspicious-link, 91).
attack(flash-file-overlay, pop-up-windows, 68).
attack(flash-file-overlay, credential-re-entering, 29).
attack(flash-file-overlay, credentials-theft, 77).
attack(flash-file-overlay, suspicious-code-modifications, 33).
attack(flash-file-overlay, frequents-spams, 72).
attack(flash-file-overlay, company-size-1-250,92).
attack(flash-file-overlay, company-size-250-500,77).
attack(flash-file-overlay, company-size-500-1000,82).
attack(flash-file-overlay, company-size-1000,86).
attack(flash-file-overlay, company-sector-hospital,89).
attack(flash-file-overlay, company-sector-finance,91).
attack(flash-file-overlay, company-sector-technology,80).
attack(flash-file-overlay, company-sector-business-and-professional-service,88).
attack(flash-file-overlay, company-sector-retail-and-manifacturing,69).
attack(flash-file-overlay, company-sector-logistics-and-transportation,60).
attack(flash-file-overlay, europe, 81).
attack(flash-file-overlay, north-america, 93).
attack(flash-file-overlay, south-america, 51).
attack(flash-file-overlay, australia, 79).
attack(flash-file-overlay, asia, 75).
attack(flash-file-overlay, africa, 49).

%iFrame Overlay
attacksymptomslist(iframe-overlay, [suspicious-conversation-email,ad-click,suspicious-link,pop-up-windows,credentials-theft,frequents-spams]).

attack(iframe-overlay, update, 3).
attack(iframe-overlay, suspicious-conversation-phone-call, 2).
attack(iframe-overlay, suspicious-conversation-phone-message, 18).
attack(iframe-overlay, suspicious-conversation-email, 98).
attack(iframe-overlay, suspicious-conversation-visit, 2).
attack(iframe-overlay, app-download, 4).
attack(iframe-overlay, ad-click, 89).
attack(iframe-overlay, ad-blocker-deactivation, 56).
attack(iframe-overlay, suspicious-link, 95).
attack(iframe-overlay, pop-up-windows, 85).
attack(iframe-overlay, credential-re-entering, 38).
attack(iframe-overlay, credentials-theft, 83).
attack(iframe-overlay, suspicious-code-modifications, 3).
attack(iframe-overlay, frequents-spams, 73).
attack(iframe-overlay, company-size-1-250,82).
attack(iframe-overlay, company-size-250-500,91).
attack(iframe-overlay, company-size-500-1000,77).
attack(iframe-overlay, company-size-1000,78).
attack(iframe-overlay, company-sector-hospital,41).
attack(iframe-overlay, company-sector-finance,75).
attack(iframe-overlay, company-sector-technology,85).
attack(iframe-overlay, company-sector-business-and-professional-service,88).
attack(iframe-overlay, company-sector-retail-and-manifacturing,30).
attack(iframe-overlay, company-sector-logistics-and-transportation,54).
attack(iframe-overlay, europe, 75).
attack(iframe-overlay, north-america, 87).
attack(iframe-overlay, south-america, 42).
attack(iframe-overlay, australia, 79).
attack(iframe-overlay, asia, 95).
attack(iframe-overlay, africa, 17).


%credential_prompt_impersonation
attacksymptomslist(credential-prompt-impersonation, [app-download,pop-up-windows,credential-re-entering,credentials-theft, frequents-spams]).

attack(credential-prompt-impersonation, update, 3).
attack(credential-prompt-impersonation, suspicious-conversation-phone-call, 12).
attack(credential-prompt-impersonation, suspicious-conversation-phone-message, 8).
attack(credential-prompt-impersonation, suspicious-conversation-email, 11).
attack(credential-prompt-impersonation, suspicious-conversation-visit, 2).
attack(credential-prompt-impersonation, app-download, 84).
attack(credential-prompt-impersonation, ad-click, 19).
attack(credential-prompt-impersonation, ad-blocker-deactivation, 16).
attack(credential-prompt-impersonation, suspicious-link, 15).
attack(credential-prompt-impersonation, pop-up-windows, 89).
attack(credential-prompt-impersonation, credential-re-entering, 99).
attack(credential-prompt-impersonation, credentials-theft, 100).
attack(credential-prompt-impersonation, suspicious-code-modifications, 3).
attack(credential-prompt-impersonation, frequents-spams, 73).
attack(credential-prompt-impersonation, company-size-1-250,84).
attack(credential-prompt-impersonation, company-size-250-500,89).
attack(credential-prompt-impersonation, company-size-500-1000,79).
attack(credential-prompt-impersonation, company-size-1000,80).
attack(credential-prompt-impersonation, company-sector-hospital,65).
attack(credential-prompt-impersonation, company-sector-finance,84).
attack(credential-prompt-impersonation, company-sector-technology,80).
attack(credential-prompt-impersonation, company-sector-business-and-professional-service,76).
attack(credential-prompt-impersonation, company-sector-retail-and-manifacturing,55).
attack(credential-prompt-impersonation, company-sector-logistics-and-transportation,73).
attack(credential-prompt-impersonation, europe, 85).
attack(credential-prompt-impersonation, north-america, 94).
attack(credential-prompt-impersonation, south-america, 52).
attack(credential-prompt-impersonation, australia, 84).
attack(credential-prompt-impersonation, asia, 75).
attack(credential-prompt-impersonation, africa, 47).

%android-activity-hijack
attacksymptomslist(android-activity-hijack, [app-download,credentials-theft,suspicious-code-modifications]).

attack(android-activity-hijack, update, 34).
attack(android-activity-hijack, suspicious-conversation-phone-call, 1).
attack(android-activity-hijack, suspicious-conversation-phone-message, 8).
attack(android-activity-hijack, suspicious-conversation-email, 11).
attack(android-activity-hijack, suspicious-conversation-visit, 1).
attack(android-activity-hijack, app-download, 84).
attack(android-activity-hijack, ad-click, 17).
attack(android-activity-hijack, ad-blocker-deactivation, 21).
attack(android-activity-hijack, suspicious-link, 24).
attack(android-activity-hijack, pop-up-windows, 56).
attack(android-activity-hijack, credential-re-entering, 19).
attack(android-activity-hijack, credentials-theft, 100).
attack(android-activity-hijack, suspicious-code-modifications, 87).
attack(android-activity-hijack, frequents-spams, 52).
attack(android-activity-hijack, company-size-1-250,89).
attack(android-activity-hijack, company-size-250-500,81).
attack(android-activity-hijack, company-size-500-1000,78).
attack(android-activity-hijack, company-size-1000,83).
attack(android-activity-hijack, company-sector-hospital,55).
attack(android-activity-hijack, company-sector-finance,89).
attack(android-activity-hijack, company-sector-technology,88).
attack(android-activity-hijack, company-sector-business-and-professional-service,79).
attack(android-activity-hijack, company-sector-retail-and-manifacturing,63).
attack(android-activity-hijack, company-sector-logistics-and-transportation,71).
attack(android-activity-hijack, europe, 87).
attack(android-activity-hijack, north-america, 86).
attack(android-activity-hijack, south-america, 51).
attack(android-activity-hijack, australia, 83).
attack(android-activity-hijack, asia, 91).
attack(android-activity-hijack, africa, 55).

%tapjacking
attacksymptomslist(tapjacking, [pop-up-windows,app-download,ad-click,frequents-spams]).

attack(tapjacking, update, 68).
attack(tapjacking, suspicious-conversation-phone-call, 6).
attack(tapjacking, suspicious-conversation-phone-message, 2).
attack(tapjacking, suspicious-conversation-email, 34).
attack(tapjacking, suspicious-conversation-visit, 2).
attack(tapjacking, app-download, 99).
attack(tapjacking, ad-click, 72).
attack(tapjacking, ad-blocker-deactivation, 66).
attack(tapjacking, suspicious-link, 55).
attack(tapjacking, pop-up-windows, 82).
attack(tapjacking, credentials-theft, 59).
attack(tapjacking, suspicious-code-modifications, 42).
attack(tapjacking, frequents-spams, 74).
attack(tapjacking, company-size-1-250,79).
attack(tapjacking, company-size-250-500,81).
attack(tapjacking, company-size-500-1000,69).
attack(tapjacking, company-size-1000,75).
attack(tapjacking, company-sector-hospital,51).
attack(tapjacking, company-sector-finance,89).
attack(tapjacking, company-sector-technology,90).
attack(tapjacking, company-sector-business-and-professional-service,76).
attack(tapjacking, company-sector-retail-and-manifacturing,68).
attack(tapjacking, company-sector-logistics-and-transportation,63).
attack(tapjacking, europe, 86).
attack(tapjacking, north-america, 88).
attack(tapjacking, south-america, 58).
attack(tapjacking, australia, 81).
attack(tapjacking, asia, 90).
attack(tapjacking, africa, 49).

%malicious_manual_software_update
attacksymptomslist(malicious-manual-software-update, [update,suspicious-conversation-email,app-download, suspicious-link,frequents-spams]).

attack(malicious-manual-software-update, update, 100).
attack(malicious-manual-software-update, suspicious-conversation-phone-call, 5).
attack(malicious-manual-software-update, suspicious-conversation-phone-message, 4).
attack(malicious-manual-software-update, suspicious-conversation-email, 72).
attack(malicious-manual-software-update, suspicious-conversation-visit, 2).
attack(malicious-manual-software-update, app-download, 87).
attack(malicious-manual-software-update, ad-click, 12).
attack(malicious-manual-software-update, ad-blocker-deactivation, 16).
attack(malicious-manual-software-update, suspicious-link, 75).
attack(malicious-manual-software-update, pop-up-windows, 19).
attack(malicious-manual-software-update, credentials-theft, 20).
attack(malicious-manual-software-update, suspicious-code-modifications, 68).
attack(malicious-manual-software-update, frequents-spams, 73).
attack(malicious-manual-software-update, company-size-1-250,78).
attack(malicious-manual-software-update, company-size-250-500,85).
attack(malicious-manual-software-update, company-size-500-1000,73).
attack(malicious-manual-software-update, company-size-1000,83).
attack(malicious-manual-software-update, company-sector-hospital,65).
attack(malicious-manual-software-update, company-sector-finance,88).
attack(malicious-manual-software-update, company-sector-technology,81).
attack(malicious-manual-software-update, company-sector-business-and-professional-service,66).
attack(malicious-manual-software-update, company-sector-retail-and-manifacturing,58).
attack(malicious-manual-software-update, company-sector-logistics-and-transportation,73).
attack(malicious-manual-software-update, europe, 85).
attack(malicious-manual-software-update, north-america, 89).
attack(malicious-manual-software-update, south-america, 47).
attack(malicious-manual-software-update, australia, 84).
attack(malicious-manual-software-update, asia, 86).
attack(malicious-manual-software-update, africa, 33).

%rooting-sim-cards
attacksymptomslist(rooting-sim-cards, [update,suspicious-conversation-phone-message,credentials-theft]).

attack(rooting-sim-cards, update, 80).
attack(rooting-sim-cards, suspicious-conversation-phone-call, 54).
attack(rooting-sim-cards, suspicious-conversation-phone-message, 100).
attack(rooting-sim-cards, suspicious-conversation-email, 1).
attack(rooting-sim-cards, suspicious-conversation-visit, 2).
attack(rooting-sim-cards, app-download, 21).
attack(rooting-sim-cards, ad-click, 11).
attack(rooting-sim-cards, ad-blocker-deactivation, 13).
attack(rooting-sim-cards, suspicious-link, 33).
attack(rooting-sim-cards, pop-up-windows, 19).
attack(rooting-sim-cards, credentials-theft, 71).
attack(rooting-sim-cards, suspicious-code-modifications, 38).
attack(rooting-sim-cards, frequents-spams, 53).
attack(rooting-sim-cards, company-size-1-250,78).
attack(rooting-sim-cards, company-size-250-500,67).
attack(rooting-sim-cards, company-size-500-1000,73).
attack(rooting-sim-cards, company-size-1000,53).
attack(rooting-sim-cards, company-sector-hospital,65).
attack(rooting-sim-cards, company-sector-finance,88).
attack(rooting-sim-cards, company-sector-technology,94).
attack(rooting-sim-cards, company-sector-business-and-professional-service,66).
attack(rooting-sim-cards, company-sector-retail-and-manifacturing,55).
attack(rooting-sim-cards, company-sector-logistics-and-transportation,71).
attack(rooting-sim-cards, europe, 86).
attack(rooting-sim-cards, north-america, 90).
attack(rooting-sim-cards, south-america, 77).
attack(rooting-sim-cards, australia, 84).
attack(rooting-sim-cards, asia, 86).
attack(rooting-sim-cards, africa, 71).


%pretexting-via-tech-support
attacksymptomslist(pretexting-via-tech-support, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,suspicious-conversation-visit,pop-up-windows,credentials-theft]).

attack(pretexting-via-tech-support, suspicious-conversation-phone-call, 99).
attack(pretexting-via-tech-support, suspicious-conversation-phone-message, 98).
attack(pretexting-via-tech-support, suspicious-conversation-email, 86).
attack(pretexting-via-tech-support, suspicious-conversation-visit, 71).
attack(pretexting-via-tech-support, pop-up-windows, 82).
attack(pretexting-via-tech-support, credentials-theft, 83).
attack(pretexting-via-tech-support, company-size-1-250,92).
attack(pretexting-via-tech-support, company-size-250-500,87).
attack(pretexting-via-tech-support, company-size-500-1000,57).
attack(pretexting-via-tech-support, company-size-1000,75).
attack(pretexting-via-tech-support, company-sector-hospital,52).
attack(pretexting-via-tech-support, company-sector-finance,2).
attack(pretexting-via-tech-support, company-sector-technology,23).
attack(pretexting-via-tech-support, company-sector-business-and-professional-service,53).
attack(pretexting-via-tech-support, company-sector-retail-and-manifacturing,76).
attack(pretexting-via-tech-support, company-sector-logistics-and-transportation,23).
attack(pretexting-via-tech-support, europe, 35).
attack(pretexting-via-tech-support, north-america, 87).
attack(pretexting-via-tech-support, south-america, 12).
attack(pretexting-via-tech-support, australia, 93).
attack(pretexting-via-tech-support, asia, 75).
attack(pretexting-via-tech-support, africa, 7).



%pretexting-via-delivery-person
attacksymptomslist(pretexting-via-delivery-person, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-visit]).

attack(pretexting-via-delivery-person, suspicious-conversation-phone-call, 87).
attack(pretexting-via-delivery-person, suspicious-conversation-phone-message, 98).
attack(pretexting-via-delivery-person, suspicious-conversation-visit, 96).
attack(pretexting-via-delivery-person, company-size-1-250,92).
attack(pretexting-via-delivery-person, company-size-250-500,7).
attack(pretexting-via-delivery-person, company-size-500-1000,19).
attack(pretexting-via-delivery-person, company-size-1000,34).
attack(pretexting-via-delivery-person, company-sector-hospital,52).
attack(pretexting-via-delivery-person, company-sector-finance,2).
attack(pretexting-via-delivery-person, company-sector-technology,23).
attack(pretexting-via-delivery-person, company-sector-business-and-professional-service,53).
attack(pretexting-via-delivery-person, company-sector-retail-and-manifacturing,76).
attack(pretexting-via-delivery-person, company-sector-logistics-and-transportation,23).
attack(pretexting-via-delivery-person, europe, 35).
attack(pretexting-via-delivery-person, north-america, 87).
attack(pretexting-via-delivery-person, south-america, 12).
attack(pretexting-via-delivery-person, australia, 93).
attack(pretexting-via-delivery-person, asia, 75).
attack(pretexting-via-delivery-person, africa, 7).


%pretexting-via-phone
attacksymptomslist(pretexting-via-phone, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,credentials-theft]).

attack(pretexting-via-phone, suspicious-conversation-phone-call, 87).
attack(pretexting-via-phone, suspicious-conversation-phone-message, 98).
attack(pretexting-via-phone, credentials-theft, 83).
attack(pretexting-via-phone, company-size-1-250,92).
attack(pretexting-via-phone, company-size-250-500,87).
attack(pretexting-via-phone, company-size-500-1000,57).
attack(pretexting-via-phone, company-size-1000,75).
attack(pretexting-via-phone, company-sector-hospital,52).
attack(pretexting-via-phone, company-sector-finance,2).
attack(pretexting-via-phone, company-sector-technology,23).
attack(pretexting-via-phone, company-sector-business-and-professional-service,53).
attack(pretexting-via-phone, company-sector-retail-and-manifacturing,76).
attack(pretexting-via-phone, company-sector-logistics-and-transportation,23).
attack(pretexting-via-phone, europe, 35).
attack(pretexting-via-phone, north-america, 87).
attack(pretexting-via-phone, south-america, 12).
attack(pretexting-via-phone, australia, 93).
attack(pretexting-via-phone, asia, 75).
attack(pretexting-via-phone, africa, 7).


%influence-perception-of-reciprocation
attacksymptomslist(influence-perception-of-reciprocation, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,ad-click,pop-up-windows,credentials-theft]).

attack(influence-perception-of-reciprocation, suspicious-conversation-phone-call, 81).
attack(influence-perception-of-reciprocation, suspicious-conversation-phone-message, 80).
attack(influence-perception-of-reciprocation, suspicious-conversation-email, 72).
attack(influence-perception-of-reciprocation, ad-click, 76).
attack(influence-perception-of-reciprocation, pop-up-windows, 72).
attack(influence-perception-of-reciprocation, credentials-theft, 71).
attack(influence-perception-of-reciprocation, company-size-1-250,92).
attack(influence-perception-of-reciprocation, company-size-250-500,87).
attack(influence-perception-of-reciprocation, company-size-500-1000,57).
attack(influence-perception-of-reciprocation, company-size-1000,75).
attack(influence-perception-of-reciprocation, company-sector-hospital,52).
attack(influence-perception-of-reciprocation, company-sector-finance,2).
attack(influence-perception-of-reciprocation, company-sector-technology,23).
attack(influence-perception-of-reciprocation, company-sector-business-and-professional-service,53).
attack(influence-perception-of-reciprocation, company-sector-retail-and-manifacturing,76).
attack(influence-perception-of-reciprocation, company-sector-logistics-and-transportation,23).
attack(influence-perception-of-reciprocation, europe, 35).
attack(influence-perception-of-reciprocation, north-america, 87).
attack(influence-perception-of-reciprocation, south-america, 12).
attack(influence-perception-of-reciprocation, australia, 93).
attack(influence-perception-of-reciprocation, asia, 75).
attack(influence-perception-of-reciprocation, africa, 7).


%influence-perception-of-scarcity
attacksymptomslist(influence-perception-of-scarcity, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,ad-click,pop-up-windows,credentials-theft]).

attack(influence-perception-of-scarcity, suspicious-conversation-phone-call, 90).
attack(influence-perception-of-scarcity, suspicious-conversation-phone-message, 98).
attack(influence-perception-of-scarcity, suspicious-conversation-email, 76).
attack(influence-perception-of-scarcity, ad-click, 87).
attack(influence-perception-of-scarcity, pop-up-windows, 90).
attack(influence-perception-of-scarcity, credentials-theft, 83).
attack(influence-perception-of-scarcity, company-size-1-250,92).
attack(influence-perception-of-scarcity, company-size-250-500,87).
attack(influence-perception-of-scarcity, company-size-500-1000,57).
attack(influence-perception-of-scarcity, company-size-1000,75).
attack(influence-perception-of-scarcity, company-sector-hospital,52).
attack(influence-perception-of-scarcity, company-sector-finance,2).
attack(influence-perception-of-scarcity, company-sector-technology,23).
attack(influence-perception-of-scarcity, company-sector-business-and-professional-service,53).
attack(influence-perception-of-scarcity, company-sector-retail-and-manifacturing,76).
attack(influence-perception-of-scarcity, company-sector-logistics-and-transportation,23).
attack(influence-perception-of-scarcity, europe, 35).
attack(influence-perception-of-scarcity, north-america, 87).
attack(influence-perception-of-scarcity, south-america, 12).
attack(influence-perception-of-scarcity, australia, 93).
attack(influence-perception-of-scarcity, asia, 75).
attack(influence-perception-of-scarcity, africa, 7).


%influence-perception-of-authority
attacksymptomslist(influence-perception-of-authority, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,ad-click,pop-up-windows,credentials-theft]).

attack(influence-perception-of-authority, suspicious-conversation-phone-call, 77).
attack(influence-perception-of-authority, suspicious-conversation-phone-message, 91).
attack(influence-perception-of-authority, suspicious-conversation-email, 94).
attack(influence-perception-of-authority, ad-click, 72).
attack(influence-perception-of-authority, pop-up-windows, 83).
attack(influence-perception-of-authority, credentials-theft, 84).
attack(influence-perception-of-authority, company-size-1-250,92).
attack(influence-perception-of-authority, company-size-250-500,87).
attack(influence-perception-of-authority, company-size-500-1000,57).
attack(influence-perception-of-authority, company-size-1000,75).
attack(influence-perception-of-authority, company-sector-hospital,52).
attack(influence-perception-of-authority, company-sector-finance,2).
attack(influence-perception-of-authority, company-sector-technology,23).
attack(influence-perception-of-authority, company-sector-business-and-professional-service,53).
attack(influence-perception-of-authority, company-sector-retail-and-manifacturing,76).
attack(influence-perception-of-authority, company-sector-logistics-and-transportation,23).
attack(influence-perception-of-authority, europe, 35).
attack(influence-perception-of-authority, north-america, 87).
attack(influence-perception-of-authority, south-america, 12).
attack(influence-perception-of-authority, australia, 93).
attack(influence-perception-of-authority, asia, 75).
attack(influence-perception-of-authority, africa, 7).


%influence-perception-of-liking
attacksymptomslist(influence-perception-of-liking, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,suspicious-conversation-visit,credentials-theft]).

attack(influence-perception-of-liking, suspicious-conversation-phone-call, 89).
attack(influence-perception-of-liking, suspicious-conversation-phone-message, 71).
attack(influence-perception-of-liking, suspicious-conversation-email, 72).
attack(influence-perception-of-liking, suspicious-conversation-visit, 77).
attack(influence-perception-of-liking, credentials-theft, 70).
attack(influence-perception-of-liking, company-size-1-250,92).
attack(influence-perception-of-liking, company-size-250-500,87).
attack(influence-perception-of-liking, company-size-500-1000,57).
attack(influence-perception-of-liking, company-size-1000,75).
attack(influence-perception-of-liking, company-sector-hospital,52).
attack(influence-perception-of-liking, company-sector-finance,2).
attack(influence-perception-of-liking, company-sector-technology,23).
attack(influence-perception-of-liking, company-sector-business-and-professional-service,53).
attack(influence-perception-of-liking, company-sector-retail-and-manifacturing,76).
attack(influence-perception-of-liking, company-sector-logistics-and-transportation,23).
attack(influence-perception-of-liking, europe, 35).
attack(influence-perception-of-liking, north-america, 87).
attack(influence-perception-of-liking, south-america, 12).
attack(influence-perception-of-liking, australia, 93).
attack(influence-perception-of-liking, asia, 75).
attack(influence-perception-of-liking, africa, 7).


%influence-perception-of-consensus-or-social-proof
attacksymptomslist(influence-perception-of-consensus-or-social-proof, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,ad-click,pop-up-windows,credentials-theft]).

attack(influence-perception-of-consensus-or-social-proof, suspicious-conversation-phone-call, 77).
attack(influence-perception-of-consensus-or-social-proof, suspicious-conversation-phone-message, 78).
attack(influence-perception-of-consensus-or-social-proof, suspicious-conversation-email, 86).
attack(influence-perception-of-consensus-or-social-proof, ad-click, 71).
attack(influence-perception-of-consensus-or-social-proof, pop-up-windows, 82).
attack(influence-perception-of-consensus-or-social-proof, credentials-theft, 83).
attack(influence-perception-of-consensus-or-social-proof, company-size-1-250,92).
attack(influence-perception-of-consensus-or-social-proof, company-size-250-500,87).
attack(influence-perception-of-consensus-or-social-proof, company-size-500-1000,57).
attack(influence-perception-of-consensus-or-social-proof, company-size-1000,75).
attack(influence-perception-of-consensus-or-social-proof, company-sector-hospital,52).
attack(influence-perception-of-consensus-or-social-proof, company-sector-finance,2).
attack(influence-perception-of-consensus-or-social-proof, company-sector-technology,23).
attack(influence-perception-of-consensus-or-social-proof, company-sector-business-and-professional-service,53).
attack(influence-perception-of-consensus-or-social-proof, company-sector-retail-and-manifacturing,76).
attack(influence-perception-of-consensus-or-social-proof, company-sector-logistics-and-transportation,23).
attack(influence-perception-of-consensus-or-social-proof, europe, 35).
attack(influence-perception-of-consensus-or-social-proof, north-america, 87).
attack(influence-perception-of-consensus-or-social-proof, south-america, 12).
attack(influence-perception-of-consensus-or-social-proof, australia, 93).
attack(influence-perception-of-consensus-or-social-proof, asia, 75).
attack(influence-perception-of-consensus-or-social-proof, africa, 7).


%target-influence-via-framing
attacksymptomslist(target-influence-via-framing, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,ad-click,pop-up-windows,credentials-theft]).

attack(target-influence-via-framing, suspicious-conversation-phone-call, 83).
attack(target-influence-via-framing, suspicious-conversation-phone-message, 98).
attack(target-influence-via-framing, suspicious-conversation-email, 72).
attack(target-influence-via-framing, ad-click, 84).
attack(target-influence-via-framing, pop-up-windows, 81).
attack(target-influence-via-framing, credentials-theft, 83).
attack(target-influence-via-framing, company-size-1-250,92).
attack(target-influence-via-framing, company-size-250-500,87).
attack(target-influence-via-framing, company-size-500-1000,57).
attack(target-influence-via-framing, company-size-1000,75).
attack(target-influence-via-framing, company-sector-hospital,52).
attack(target-influence-via-framing, company-sector-finance,2).
attack(target-influence-via-framing, company-sector-technology,23).
attack(target-influence-via-framing, company-sector-business-and-professional-service,53).
attack(target-influence-via-framing, company-sector-retail-and-manifacturing,76).
attack(target-influence-via-framing, company-sector-logistics-and-transportation,23).
attack(target-influence-via-framing, europe, 35).
attack(target-influence-via-framing, north-america, 87).
attack(target-influence-via-framing, south-america, 12).
attack(target-influence-via-framing, australia, 93).
attack(target-influence-via-framing, asia, 75).
attack(target-influence-via-framing, africa, 7).


%influence-via-modes-of-thinking
attacksymptomslist(influence-via-modes-of-thinking, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-visit,credentials-theft]).

attack(influence-via-modes-of-thinking, suspicious-conversation-phone-call, 82).
attack(influence-via-modes-of-thinking, suspicious-conversation-phone-message, 88).
attack(influence-via-modes-of-thinking, suspicious-conversation-visit, 74).
attack(influence-via-modes-of-thinking, credentials-theft, 78).
attack(influence-via-modes-of-thinking, company-size-1-250,92).
attack(influence-via-modes-of-thinking, company-size-250-500,87).
attack(influence-via-modes-of-thinking, company-size-500-1000,57).
attack(influence-via-modes-of-thinking, company-size-1000,75).
attack(influence-via-modes-of-thinking, company-sector-hospital,52).
attack(influence-via-modes-of-thinking, company-sector-finance,2).
attack(influence-via-modes-of-thinking, company-sector-technology,23).
attack(influence-via-modes-of-thinking, company-sector-business-and-professional-service,53).
attack(influence-via-modes-of-thinking, company-sector-retail-and-manifacturing,76).
attack(influence-via-modes-of-thinking, company-sector-logistics-and-transportation,23).
attack(influence-via-modes-of-thinking, europe, 35).
attack(influence-via-modes-of-thinking, north-america, 87).
attack(influence-via-modes-of-thinking, south-america, 12).
attack(influence-via-modes-of-thinking, australia, 93).
attack(influence-via-modes-of-thinking, asia, 75).
attack(influence-via-modes-of-thinking, africa, 7).



%target-influence-via-interview-and-interrogation
attacksymptomslist(target-influence-via-interview-and-interrogation, [suspicious-conversation-phone-call,suspicious-conversation-phone-message,suspicious-conversation-email,ad-click,pop-up-windows]).

attack(target-influence-via-interview-and-interrogation, suspicious-conversation-phone-call, 90).
attack(target-influence-via-interview-and-interrogation, suspicious-conversation-phone-message, 73).
attack(target-influence-via-interview-and-interrogation, suspicious-conversation-email, 78).
attack(target-influence-via-interview-and-interrogation, ad-click, 81).
attack(target-influence-via-interview-and-interrogation, pop-up-windows, 76).
attack(target-influence-via-interview-and-interrogation, company-size-1-250,92).
attack(target-influence-via-interview-and-interrogation, company-size-250-500,87).
attack(target-influence-via-interview-and-interrogation, company-size-500-1000,57).
attack(target-influence-via-interview-and-interrogation, company-size-1000,75).
attack(target-influence-via-interview-and-interrogation, company-sector-hospital,52).
attack(target-influence-via-interview-and-interrogation, company-sector-finance,2).
attack(target-influence-via-interview-and-interrogation, company-sector-technology,23).
attack(target-influence-via-interview-and-interrogation, company-sector-business-and-professional-service,53).
attack(target-influence-via-interview-and-interrogation, company-sector-retail-and-manifacturing,76).
attack(target-influence-via-interview-and-interrogation, company-sector-logistics-and-transportation,23).
attack(target-influence-via-interview-and-interrogation, europe, 35).
attack(target-influence-via-interview-and-interrogation, north-america, 87).
attack(target-influence-via-interview-and-interrogation, south-america, 12).
attack(target-influence-via-interview-and-interrogation, australia, 93).
attack(target-influence-via-interview-and-interrogation, asia, 75).
attack(target-influence-via-interview-and-interrogation, africa, 7).




%mere zastite----------------------------------------------------------------------


%counterfeit-websites
countermeasure(counterfeit-websites, only_click_on_familiar_links,96).
countermeasure(counterfeit-websites, employee_education, 82).
countermeasure(counterfeit-websites, antivirus, 76).
countermeasure(typo-squatting, authenticate_all_servers, 87).

%pharming
countermeasure(pharming, only_click_on_familiar_links,92).
countermeasure(pharming, employee_education, 92).
countermeasure(pharming, turn_on_spam_filter, 74).
countermeasure(pharming, bad_grammar_check, 90).
countermeasure(pharming, antivirus, 91).

%spear-phishing
countermeasure(spear-phishing, only_click_on_familiar_links,95).
countermeasure(spear-phishing, employee_education, 89).
countermeasure(spear-phishing, turn_on_spam_filter, 94).
countermeasure(spear-phishing, bad_grammar_check, 83).
countermeasure(spear-phishing, two_way_authentification, 80).
countermeasure(spear-phishing, antivirus, 81).

%mobile-phishing
countermeasure(mobile-phishing, only_click_on_familiar_links,49).
countermeasure(mobile-phishing, employee_education, 85).
countermeasure(mobile-phishing, bad_grammar_check, 73).
countermeasure(mobile-phishing, antivirus, 80).
countermeasure(mobile-phishing, not_responding_to_unknown_number, 97).
countermeasure(mobile-phishing, give_only_required_information, 92).

%voice-phishing
countermeasure(voice-phishing, employee_education, 89).
countermeasure(voice-phishing, not_responding_to_unknown_number, 98).
countermeasure(voice-phishing, give_only_required_information, 94).

%typo-squatting
countermeasure(typo-squatting, only_click_on_familiar_links,97).
countermeasure(typo-squatting, employee_education, 90).
countermeasure(typo-squatting, antivirus, 79).
countermeasure(typo-squatting, authenticate_all_servers, 93).
countermeasure(typo-squatting, DNS_hostnames_check, 94). 

%sound-squatting
countermeasure(sound-squatting, only_click_on_familiar_links,96).
countermeasure(sound-squatting, employee_education, 90).
countermeasure(sound-squatting, antivirus, 78).
countermeasure(sound-squatting, authenticate_all_servers, 94).
countermeasure(sound-squatting, DNS_hostnames_check, 95). 

%homograph-attack-via-homoglyphs
countermeasure(homograph-attack-via-homoglyphs, only_click_on_familiar_links,95).
countermeasure(homograph-attack-via-homoglyphs, employee_education, 90).
countermeasure(homograph-attack-via-homoglyphs, antivirus, 79).
countermeasure(homograph-attack-via-homoglyphs, authenticate_all_servers, 95).
countermeasure(homograph-attack-via-homoglyphs, DNS_hostnames_check, 95). 
countermeasure(homograph-attack-via-homoglyphs, browsers_that_can_warn_about_characters_from_different_character_sets, 96). 

%bit-squatting
countermeasure(bit-squatting, only_click_on_familiar_links,94).
countermeasure(bit-squatting, employee_education, 93).
countermeasure(bit-squatting, antivirus, 79).
countermeasure(bit-squatting, authenticate_all_servers, 94).
countermeasure(bit-squatting, DNS_hostnames_check, 92). 
countermeasure(bit-squatting, error_correcting_memory, 93). 

%pretexting-via-customer-service
countermeasure(pretexting-via-customer-service, validate_phone_number, 95).
countermeasure(pretexting-via-customer-service, employee_education,47).

%dns-domain-seizure
countermeasure(dns-domain-seizure, contact_emergency_services, 95).
countermeasure(dns-domain-seizure, restore_from_back_up, 77).

%influence-via-incentives
countermeasure(influence-via-incentives, educate_employees, 81).
countermeasure(influence-via-incentives, give_only_required_information, 59).

%harvesting-information-via-api-event-monitoring
countermeasure(harvesting-information-via-api-event-monitoring, encrypt_data_transmission,93).

%flash-file-overlay
countermeasure(flash-file-overlay, turn_off_flash, 99).
countermeasure(flash-file-overlay, evaluate_email_protection , 84).
countermeasure(flash-file-overlay, employee_education,77).

%iframe-overlay
countermeasure(iframe-overlay, disable_iframes, 95).
countermeasure(iframe-overlay, evaluate_email_protection , 92).
countermeasure(iframe-overlay, add_csp , 88).
countermeasure(iframe-overlay, employee_education,77).

%credential-prompt-impersonation
countermeasure(credential-prompt-impersonation, avoid_installing_malicious_applications, 88).
countermeasure(credential-prompt-impersonation, avoid_suspicious_applications_with_GET_TASKS_permission, 79).
countermeasure(credential-prompt-impersonation, employee_education,72).

%android-activity-hijack
countermeasure(android-activity-hijack, ah_detecor, 94).
countermeasure(android-activity-hijack, use_explicit_intents, 88).

%tapjacking
countermeasure(tapjacking, turn_on_filterTouchesWhenObscured, 100).
countermeasure(tapjacking, employee_education, 75).

%malicious-manual-software-update
countermeasure(malicious-manual-software-update, validate_software_updates, 88).
countermeasure(malicious-manual-software-update, install_MSRT, 70).
countermeasure(malicious-manual-software-update, employee_education, 65).

%rooting-sim-cards
countermeasure(rooting-sim-cards, upgrade_sim_card_to_use_AES, 98).
countermeasure(rooting-sim-cards, upgrade_sim_card_to_use_DES, 72).

%target-influence-via-interview-and-interrogation
countermeasure(target-influence-via-interview-and-interrogation, employee_education,84).

%influence-via-modes-of-thinking
countermeasure(influence-via-modes-of-thinking, employee_education,82).

%target-influence-via-framing
countermeasure(target-influence-via-framing, employee_education,81).
countermeasure(target-influence-via-framing, give_only_required_information, 93).

%influence-perception-of-consensus-or-social-proof
countermeasure(influence-perception-of-consensus-or-social-proof, employee_education,90).

%influence-perception-of-liking
countermeasure(influence-perception-of-liking, employee_education,75).

%influence-perception-of-authority
countermeasure(influence-perception-of-authority, employee_education,78).

%influence-perception-of-scarcity
countermeasure(influence-perception-of-scarcity, employee_education,89).

%influence-perception-of-reciprocation
countermeasure(influence-perception-of-reciprocation, employee_education,81).

%pretexting-via-phone
countermeasure(pretexting-via-phone, employee_education,82).
countermeasure(pretexting-via-phone, validate_phone_number,48).

%pretexting-via-delivery-person
countermeasure(pretexting-via-delivery-person, employee_education,80).
countermeasure(pretexting-via-delivery-person, validate_phone_number,43).

%pretexting-via-tech-support
countermeasure(pretexting-via-tech-support, employee_education,70).
countermeasure(pretexting-via-tech-support, validate_phone_number,47).



%pravila-----------------------------------------------------------------------------------

contains(S,[]).
contains(S,[H|T]) :- member(H,S), contains(S,T).

possible_attack_by_symptoms(S,J) :- attacksymptomslist(J,S2), contains(S2,S).

countermeasures(A,L) :- findall(X, countermeasure(A,X,V),L).
countermeasures_sorted(A,L) :- findall([V,X], countermeasure(A,X,V), L1),sort(L1,L).