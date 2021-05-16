%napadi i simptomi i ucestalost njihovog koriscenja-----------------------------

%counterfeit-websites
attacksymptomslist(counterfeit_websites, [suspicious_conversation_email,suspicious_link,suspicious_website,credentials_theft]).

attack(counterfeit_websites, update, 12).
attack(counterfeit_websites, suspicious_conversation_email, 89).
attack(counterfeit_websites, app_download, 17).
attack(counterfeit_websites, ad_click, 11).
attack(counterfeit_websites, ad_blocker_deactivation, 3).
attack(counterfeit_websites, suspicious_link, 96).
attack(counterfeit_websites, suspicious_website, 100).
attack(counterfeit_websites, pop_up_windows, 23).
attack(counterfeit_websites, credential_re_entering, 22).
attack(counterfeit_websites, services_fail, 25).
attack(counterfeit_websites, credentials_theft, 92).
attack(counterfeit_websites, frequents_spams, 57).
attack(counterfeit_websites, company-size-1-250,78).
attack(counterfeit_websites, company-size-250-500,85).
attack(counterfeit_websites, company-size-500-1000,80).
attack(counterfeit_websites, company-size-1000,70).
attack(counterfeit_websites, company-sector-hospital, 46).
attack(counterfeit_websites, company-sector-finance, 89).
attack(counterfeit_websites, company-sector-technology,83).
attack(counterfeit_websites, company-sector-business-and-professional-service,64).
attack(counterfeit_websites, company-sector-retail-and-manifacturing,62).
attack(counterfeit_websites, company-sector-logistics-and-transportation,57).
attack(counterfeit_websites, europe, 87).
attack(counterfeit_websites, north-america, 88).
attack(counterfeit_websites, south-america, 74).
attack(counterfeit_websites, australia, 86).
attack(counterfeit_websites, asia, 85).
attack(counterfeit_websites, africa, 22).

%pharming
attacksymptomslist(pharming, [suspicious_link,suspicious_website,credential_re_entering,credentials_theft,virus_detection]).

attack(pharming, update, 16).
attack(pharming, suspicious_conversation_email, 63).
attack(pharming, app_download, 19).
attack(pharming, ad_click, 15).
attack(pharming, ad_blocker_deactivation, 3).
attack(pharming, suspicious_link, 97).
attack(pharming, suspicious_website, 95).
attack(pharming, pop_up_windows, 23).
attack(pharming, credential_re_entering, 75).
attack(pharming, services_fail, 29).
attack(pharming, credentials_theft, 72).
attack(pharming, frequents_spams, 47).
attack(pharming, virus_detection, 83).
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
attacksymptomslist(spear_phishing, [suspicious_conversation_email,suspicious_link,suspicious_website,credentials_theft,frequents_spams]).

attack(spear_phishing, update, 19).
attack(spear_phishing, suspicious_conversation_phone_call, 5).
attack(spear_phishing, suspicious_conversation_phone_message, 5).
attack(spear_phishing, suspicious_conversation_email, 100).
attack(spear_phishing, suspicious_conversation_visit, 30).
attack(spear_phishing, app_download, 23).
attack(spear_phishing, suspicious_link, 97).
attack(spear_phishing, suspicious_website, 89).
attack(spear_phishing, credential_re_entering, 26).
attack(spear_phishing, credentials_theft, 98).
attack(spear_phishing, frequents_spams, 72).
attack(spear_phishing, company-size-1-250,87).
attack(spear_phishing, company-size-250-500,90).
attack(spear_phishing, company-size-500-1000,93).
attack(spear_phishing, company-size-1000,86).
attack(spear_phishing, company-sector-hospital,25).
attack(spear_phishing, company-sector-finance,89).
attack(spear_phishing, company-sector-technology,83).
attack(spear_phishing, company-sector-business-and-professional-service,78).
attack(spear_phishing, company-sector-retail-and-manifacturing,37).
attack(spear_phishing, company-sector-logistics-and-transportation,38).
attack(spear_phishing, europe, 79).
attack(spear_phishing, north-america, 86).
attack(spear_phishing, south-america, 78).
attack(spear_phishing, australia, 89).
attack(spear_phishing, asia, 88).
attack(spear_phishing, africa, 29).

%mobile-phishing
attacksymptomslist(mobile_phishing, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_link,credentials_theft,frequents_spams]).

attack(mobile_phishing, update, 7).
attack(mobile_phishing, suspicious_conversation_phone_call, 100).
attack(mobile_phishing, suspicious_conversation_phone_message, 100).
attack(mobile_phishing, suspicious_conversation_email, 49).
attack(mobile_phishing, app_download, 18).
attack(mobile_phishing, ad_click, 9).
attack(mobile_phishing, ad_blocker_deactivation, 4).
attack(mobile_phishing, suspicious_link, 99).
attack(mobile_phishing, pop_up_windows, 10).
attack(mobile_phishing, credential_re_entering, 7).
attack(mobile_phishing, credentials_theft, 99).
attack(mobile_phishing, frequents_spams, 73).
attack(mobile_phishing, company-size-1-250,87).
attack(mobile_phishing, company-size-250-500,90).
attack(mobile_phishing, company-size-500-1000,93).
attack(mobile_phishing, company-size-1000,84).
attack(mobile_phishing, company-sector-hospital,44).
attack(mobile_phishing, company-sector-finance,88).
attack(mobile_phishing, company-sector-technology,76).
attack(mobile_phishing, company-sector-business-and-professional-service,70).
attack(mobile_phishing, company-sector-retail-and-manifacturing,63).
attack(mobile_phishing, company-sector-logistics-and-transportation,49).
attack(mobile_phishing, europe, 79).
attack(mobile_phishing, north-america, 83).
attack(mobile_phishing, south-america, 70).
attack(mobile_phishing, australia, 85).
attack(mobile_phishing, asia, 87).
attack(mobile_phishing, africa, 28).

%voice-phishing
attacksymptomslist(voice_phishing, [suspicious_conversation_phone_call,credentials_theft,frequents_spams]).

attack(voice_phishing, suspicious_conversation_phone_call, 100).
attack(voice_phishing, app_download, 5).
attack(voice_phishing, ad_click, 4).
attack(voice_phishing, ad_blocker_deactivation, 4).
attack(voice_phishing, suspicious_link, 4).
attack(voice_phishing, pop_up_windows, 6).
attack(voice_phishing, credential_re_entering, 7).
attack(voice_phishing, credentials_theft, 99).
attack(voice_phishing, frequents_spams, 79).
attack(voice_phishing, company-size-1-250,88).
attack(voice_phishing, company-size-250-500,90).
attack(voice_phishing, company-size-500-1000,93).
attack(voice_phishing, company-size-1000,84).
attack(voice_phishing, company-sector-hospital,43).
attack(voice_phishing, company-sector-finance,87).
attack(voice_phishing, company-sector-technology,75).
attack(voice_phishing, company-sector-business-and-professional-service,75).
attack(voice_phishing, company-sector-retail-and-manifacturing,69).
attack(voice_phishing, company-sector-logistics-and-transportation,48).
attack(voice_phishing, europe, 79).
attack(voice_phishing, north-america, 83).
attack(voice_phishing, south-america, 70).
attack(voice_phishing, australia, 85).
attack(voice_phishing, asia, 87).
attack(voice_phishing, africa, 28).

%typo-squatting
attacksymptomslist(typo_squatting, [suspicious_conversation_email,suspicious_link,suspicious_website,credentials_theft,frequents_spams]).

attack(typo_squatting, update, 14).
attack(typo_squatting, suspicious_conversation_email, 87).
attack(typo_squatting, ad_click, 16).
attack(typo_squatting, ad_blocker_deactivation, 3).
attack(typo_squatting, suspicious_link, 100).
attack(typo_squatting, pop_up_windows, 23).
attack(typo_squatting, suspicious_website, 90).
attack(typo_squatting, credential_re_entering, 7).
attack(typo_squatting, credentials_theft, 90).
attack(typo_squatting, frequents_spams, 84).
attack(typo_squatting, company-size-1-250,89).
attack(typo_squatting, company-size-250-500,95).
attack(typo_squatting, company-size-500-1000,93).
attack(typo_squatting, company-size-1000,89).
attack(typo_squatting, company-sector-hospital, 61).
attack(typo_squatting, company-sector-finance, 79).
attack(typo_squatting, company-sector-technology, 85).
attack(typo_squatting, company-sector-business-and-professional-service, 77).
attack(typo_squatting, company-sector-retail-and-manifacturing,62).
attack(typo_squatting, company-sector-logistics-and-transportation,53).
attack(typo_squatting, europe, 78).
attack(typo_squatting, north-america, 92).
attack(typo_squatting, south-america, 67).
attack(typo_squatting, australia, 89).
attack(typo_squatting, asia, 81).
attack(typo_squatting, africa, 30).

%sound-squatting
attacksymptomslist(sound_squatting, [suspicious_conversation_email,suspicious_link,suspicious_website,credentials_theft,frequents_spams]).

attack(sound_squatting, update, 13).
attack(sound_squatting, suspicious_conversation_email, 71).
attack(sound_squatting, ad_click, 15).
attack(sound_squatting, ad_blocker_deactivation, 4).
attack(sound_squatting, suspicious_link, 100).
attack(sound_squatting, pop_up_windows, 24).
attack(sound_squatting, suspicious_website, 95).
attack(sound_squatting, credential_re_entering, 8).
attack(sound_squatting, credentials_theft, 90).
attack(sound_squatting, frequents_spams, 82).
attack(sound_squatting, company-size-1-250,88).
attack(sound_squatting, company-size-250-500,93).
attack(sound_squatting, company-size-500-1000,92).
attack(sound_squatting, company-size-1000,87).
attack(sound_squatting, company-sector-hospital, 61).
attack(sound_squatting, company-sector-finance, 79).
attack(sound_squatting, company-sector-technology, 86).
attack(sound_squatting, company-sector-business-and-professional-service, 77).
attack(sound_squatting, company-sector-retail-and-manifacturing,62).
attack(sound_squatting, company-sector-logistics-and-transportation,58).
attack(sound_squatting, europe, 79).
attack(sound_squatting, north-america, 90).
attack(sound_squatting, south-america, 69).
attack(sound_squatting, australia, 85).
attack(sound_squatting, asia, 80).
attack(sound_squatting, africa, 31).

%homograph-attack-via-homoglyphs
attacksymptomslist(homograph_attack_via_homoglyphs, [suspicious_conversation_email,suspicious_link,suspicious_website,credentials_theft,frequents_spams]).

attack(homograph_attack_via_homoglyphs, update, 12).
attack(homograph_attack_via_homoglyphs, suspicious_conversation_email, 71).
attack(homograph_attack_via_homoglyphs, ad_click, 13).
attack(homograph_attack_via_homoglyphs, ad_blocker_deactivation, 4).
attack(homograph_attack_via_homoglyphs, suspicious_link, 97).
attack(homograph_attack_via_homoglyphs, pop_up_windows, 26).
attack(homograph_attack_via_homoglyphs, suspicious_website, 96).
attack(homograph_attack_via_homoglyphs, credential_re_entering, 9).
attack(homograph_attack_via_homoglyphs, credentials_theft, 92).
attack(homograph_attack_via_homoglyphs, frequents_spams, 84).
attack(homograph_attack_via_homoglyphs, company-size-1-250,89).
attack(homograph_attack_via_homoglyphs, company-size-250-500,94).
attack(homograph_attack_via_homoglyphs, company-size-500-1000,90).
attack(homograph_attack_via_homoglyphs, company-size-1000,88).
attack(homograph_attack_via_homoglyphs, company-sector-hospital, 62).
attack(homograph_attack_via_homoglyphs, company-sector-finance, 78).
attack(homograph_attack_via_homoglyphs, company-sector-technology, 88).
attack(homograph_attack_via_homoglyphs, company-sector-business-and-professional-service, 76).
attack(homograph_attack_via_homoglyphs, company-sector-retail-and-manifacturing,61).
attack(homograph_attack_via_homoglyphs, company-sector-logistics-and-transportation,59).
attack(homograph_attack_via_homoglyphs, europe, 78).
attack(homograph_attack_via_homoglyphs, north-america, 91).
attack(homograph_attack_via_homoglyphs, south-america, 68).
attack(homograph_attack_via_homoglyphs, australia, 84).
attack(homograph_attack_via_homoglyphs, asia, 81).
attack(homograph_attack_via_homoglyphs, africa, 28).

%bit-squatting
attacksymptomslist(bit_squatting, [suspicious_conversation_email,suspicious_link,suspicious_website,credentials_theft,frequents_spams]).

attack(bit_squatting, update, 10).
attack(bit_squatting, suspicious_conversation_email, 84).
attack(bit_squatting, ad_click, 14).
attack(bit_squatting, ad_blocker_deactivation, 3).
attack(bit_squatting, suspicious_link, 100).
attack(bit_squatting, pop_up_windows, 22).
attack(bit_squatting, suspicious_website, 93).
attack(bit_squatting, credential_re_entering, 9).
attack(bit_squatting, credentials_theft, 92).
attack(bit_squatting, frequents_spams, 84).
attack(bit_squatting, company-size-1-250,84).
attack(bit_squatting, company-size-250-500,94).
attack(bit_squatting, company-size-500-1000,92).
attack(bit_squatting, company-size-1000,88).
attack(bit_squatting, company-sector-hospital, 60).
attack(bit_squatting, company-sector-finance, 77).
attack(bit_squatting, company-sector-technology, 87).
attack(bit_squatting, company-sector-business-and-professional-service, 79).
attack(bit_squatting, company-sector-retail-and-manifacturing,67).
attack(bit_squatting, company-sector-logistics-and-transportation,55).
attack(bit_squatting, europe, 82).
attack(bit_squatting, north-america, 90).
attack(bit_squatting, south-america, 69).
attack(bit_squatting, australia, 87).
attack(bit_squatting, asia, 79).
attack(bit_squatting, africa, 28).


%pretexting-via-customer-service
attacksymptomslist(pretexting_via_customer_service, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,ad_click,pop_up_windows,credentials_theft]).

attack(pretexting_via_customer_service, suspicious_conversation_phone_call, 87).
attack(pretexting_via_customer_service, suspicious_conversation_phone_message, 98).
attack(pretexting_via_customer_service, ssuspicious_conversation_email, 76).
attack(pretexting_via_customer_service, ad_click, 86).
attack(pretexting_via_customer_service, pop_up_windows, 82).
attack(pretexting_via_customer_service, credentials_theft, 83).
attack(pretexting_via_customer_service, company-size-1-250,92).
attack(pretexting_via_customer_service, company-size-250-500,87).
attack(pretexting_via_customer_service, company-size-500-1000,57).
attack(pretexting_via_customer_service, company-size-1000,75).
attack(pretexting_via_customer_service, company-sector-hospital,52).
attack(pretexting_via_customer_service, company-sector-finance,2).
attack(pretexting_via_customer_service, company-sector-technology,23).
attack(pretexting_via_customer_service, company-sector-business-and-professional-service,53).
attack(pretexting_via_customer_service, company-sector-retail-and-manifacturing,76).
attack(pretexting_via_customer_service, company-sector-logistics-and-transportation,23).
attack(pretexting_via_customer_service, europe, 35).
attack(pretexting_via_customer_service, north-america, 87).
attack(pretexting_via_customer_service, south-america, 12).
attack(pretexting_via_customer_service, australia, 93).
attack(pretexting_via_customer_servicee, asia, 75).
attack(pretexting_via_customer_service, africa, 7).


%dns-domain-seizure
attacksymptomslist(dns_domain_seizure, [credential_re_entering,services_fail,credentials_theft,suspicious_code_modifications]).

attack(dns_domain_seizure, credential_re_entering, 79).
attack(dns_domain_seizure, services_fail, 99).
attack(dns_domain_seizure, credentials_theft, 83).
attack(dns_domain_seizure, suspicious_code_modifications, 73).
attack(dns_domain_seizure, company-size-1-250, 11).
attack(dns_domain_seizure, company-size-250-500, 7).
attack(dns_domain_seizure, company-size-500-1000, 37).
attack(dns_domain_seizure, company-size-1000,75).
attack(dns_domain_seizure, company-sector-hospital, 52).
attack(dns_domain_seizure, company-sector-finance,88).
attack(dns_domain_seizure, company-sector-technology, 23).
attack(dns_domain_seizure, company-sector-business-and-professional-service,73).
attack(dns_domain_seizure, company-sector-retail-and-manifacturing,48).
attack(dns_domain_seizure, company-sector-logistics-and-transportation, 89).
attack(dns_domain_seizure, europe, 53).
attack(dns_domain_seizure, north-america, 87).
attack(dns_domain_seizure, south-america, 12).
attack(dns_domain_seizure, australia, 76).
attack(dns_domain_seizure, asia, 75).
attack(dns_domain_seizure, africa, 17).


%influence-via-incentives
attacksymptomslist(influence_via_incentives, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,suspicious_conversation_visit,bribery,suspicious_link,credentials_theft]).


attack(influence_via_incentives, suspicious_conversation_phone_call, 97).
attack(influence_via_incentives, suspicious_conversation_phone_message, 98).
attack(influence_via_incentives, suspicious_conversation_email, 91).
attack(influence_via_incentives, suspicious_conversation_visit, 85).
attack(influence_via_incentives, bribery, 70).
attack(influence_via_incentives, suspicious_link, 89).
attack(influence_via_incentives, credentials_theft, 83).
attack(influence_via_incentives, company-size-1-250, 65).
attack(influence_via_incentives, company-size-250-500, 17).
attack(influence_via_incentives, company-size-500-1000,37).
attack(influence_via_incentives, company-size-1000,5).
attack(influence_via_incentives, company-sector-hospital, 2).
attack(influence_via_incentives, company-sector-finance,8).
attack(influence_via_incentives, company-sector-technology, 43).
attack(influence_via_incentives, company-sector-business-and-professional-service,83).
attack(influence_via_incentives, company-sector-retail-and-manifacturing,78).
attack(influence_via_incentives, company-sector-logistics-and-transportation, 39).
attack(influence_via_incentives, europe, 53).
attack(influence_via_incentives, north-america, 87).
attack(influence_via_incentives, south-america, 12).
attack(influence_via_incentives, australia, 76).
attack(influence_via_incentives, asia, 75).
attack(influence_via_incentives, africa, 17).


%harvesting-information-via-api-event-monitoring
attacksymptomslist(harvesting_information_via_api_event_monitoring, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_visit,app_download,credential_re_entering,credentials_theft,frequents_spams]).

attack(harvesting_information_via_api_event_monitoring, suspicious_conversation_phone_call, 98).
attack(harvesting_information_via_api_event_monitoring, suspicious_conversation_phone_message, 84).
attack(harvesting_information_via_api_event_monitoring, suspicious_conversation_visit, 79).
attack(harvesting_information_via_api_event_monitoring, app_download, 70).
attack(harvesting_information_via_api_event_monitoring, credential_re_entering, 79).
attack(harvesting_information_via_api_event_monitoring, credentials_theft, 81).
attack(harvesting_information_via_api_event_monitoring, frequents_spams, 71).
attack(harvesting_information_via_api_event_monitoring, company-size-1-250, 56).
attack(harvesting_information_via_api_event_monitoring, company-size-250-500, 73).
attack(harvesting_information_via_api_event_monitoring, company-size-500-1000,13).
attack(harvesting_information_via_api_event_monitoring, company-size-1000,75).
attack(harvesting_information_via_api_event_monitoring, company-sector-hospital, 32).
attack(harvesting_information_via_api_event_monitoring, company-sector-finance,58).
attack(harvesting_information_via_api_event_monitoring, company-sector-technology, 73).
attack(harvesting_information_via_api_event_monitoring, company-sector-business-and-professional-service,71).
attack(harvesting_information_via_api_event_monitoring, company-sector-retail-and-manifacturing,35).
attack(harvesting_information_via_api_event_monitoring, company-sector-logistics-and-transportation, 9).
attack(harvesting_information_via_api_event_monitoring, europe, 77).
attack(harvesting_information_via_api_event_monitoring, north-america, 87).
attack(harvesting_information_via_api_event_monitoring, south-america, 92).
attack(harvesting_information_via_api_event_monitoring, australia, 72).
attack(harvesting_information_via_api_event_monitoring, asia, 15).
attack(harvesting_information_via_api_event_monitoring, africa, 98).

%flash-file-overlay
attacksymptomslist(flash_file_overlay, [suspicious_conversation_email, ad_click,suspicious_link,credentials_theft,frequents_spams]).

attack(flash_file_overlay, update, 2).
attack(flash_file_overlay, suspicious_conversation_phone_call, 3).
attack(flash_file_overlay, suspicious_conversation_phone_message, 15).
attack(flash_file_overlay, suspicious_conversation_email, 93).
attack(flash_file_overlay, suspicious_conversation_visit, 1).
attack(flash_file_overlay, app_download, 3).
attack(flash_file_overlay, ad_click, 91).
attack(flash_file_overlay, ad_blocker_deactivation, 44).
attack(flash_file_overlay, suspicious_link, 91).
attack(flash_file_overlay, pop_up_windows, 68).
attack(flash_file_overlay, credential_re_entering, 29).
attack(flash_file_overlay, credentials_theft, 77).
attack(flash_file_overlay, suspicious_code_modifications, 33).
attack(flash_file_overlay, frequents_spams, 72).
attack(flash_file_overlay, company-size-1-250,92).
attack(flash_file_overlay, company-size-250-500,77).
attack(flash_file_overlay, company-size-500-1000,82).
attack(flash_file_overlay, company-size-1000,86).
attack(flash_file_overlay, company-sector-hospital,89).
attack(flash_file_overlay, company-sector-finance,91).
attack(flash_file_overlay, company-sector-technology,80).
attack(flash_file_overlay, company-sector-business-and-professional-service,88).
attack(flash_file_overlay, company-sector-retail-and-manifacturing,69).
attack(flash_file_overlay, company-sector-logistics-and-transportation,60).
attack(flash_file_overlay, europe, 81).
attack(flash_file_overlay, north-america, 93).
attack(flash_file_overlay, south-america, 51).
attack(flash_file_overlay, australia, 79).
attack(flash_file_overlay, asia, 75).
attack(flash_file_overlay, africa, 49).

%iFrame Overlay
attacksymptomslist(iframe_overlay, [suspicious_conversation_email,ad_click,suspicious_link,pop_up_windows,credentials_theft,frequents_spams]).

attack(iframe_overlay, update, 3).
attack(iframe_overlay, suspicious_conversation_phone_call, 2).
attack(iframe_overlay, suspicious_conversation_phone_message, 18).
attack(iframe_overlay, suspicious_conversation_email, 98).
attack(iframe_overlay, suspicious_conversation_visit, 2).
attack(iframe_overlay, app_download, 4).
attack(iframe_overlay, ad_click, 89).
attack(iframe_overlay, ad_blocker_deactivation, 56).
attack(iframe_overlay, suspicious_link, 95).
attack(iframe_overlay, pop_up_windows, 85).
attack(iframe_overlay, credential_re_entering, 38).
attack(iframe_overlay, credentials_theft, 83).
attack(iframe_overlay, suspicious_code_modifications, 3).
attack(iframe_overlay, frequents_spams, 73).
attack(iframe_overlay, company-size-1-250,82).
attack(iframe_overlay, company-size-250-500,91).
attack(iframe_overlay, company-size-500-1000,77).
attack(iframe_overlay, company-size-1000,78).
attack(iframe_overlay, company-sector-hospital,41).
attack(iframe_overlay, company-sector-finance,75).
attack(iframe_overlay, company-sector-technology,85).
attack(iframe_overlay, company-sector-business-and-professional-service,88).
attack(iframe_overlay, company-sector-retail-and-manifacturing,30).
attack(iframe_overlay, company-sector-logistics-and-transportation,54).
attack(iframe_overlay, europe, 75).
attack(iframe_overlay, north-america, 87).
attack(iframe_overlay, south-america, 42).
attack(iframe_overlay, australia, 79).
attack(iframe_overlay, asia, 95).
attack(iframe_overlay, africa, 17).


%credential_prompt_impersonation
attacksymptomslist(credential_prompt_impersonation, [app_download,pop_up_windows,credential_re_entering,credentials_theft, frequents_spams]).

attack(credential_prompt_impersonation, update, 3).
attack(credential_prompt_impersonation, suspicious_conversation_phone_call, 12).
attack(credential_prompt_impersonation, suspicious_conversation_phone_message, 8).
attack(credential_prompt_impersonation, suspicious_conversation_email, 11).
attack(credential_prompt_impersonation, suspicious_conversation_visit, 2).
attack(credential_prompt_impersonation, app_download, 84).
attack(credential_prompt_impersonation, ad_click, 19).
attack(credential_prompt_impersonation, ad_blocker_deactivation, 16).
attack(credential_prompt_impersonation, suspicious_link, 15).
attack(credential_prompt_impersonation, pop_up_windows, 89).
attack(credential_prompt_impersonation, credential_re_entering, 99).
attack(credential_prompt_impersonation, credentials_theft, 100).
attack(credential_prompt_impersonation, suspicious_code_modifications, 3).
attack(credential_prompt_impersonation, frequents_spams, 73).
attack(credential_prompt_impersonation, company-size-1-250,84).
attack(credential_prompt_impersonation, company-size-250-500,89).
attack(credential_prompt_impersonation, company-size-500-1000,79).
attack(credential_prompt_impersonation, company-size-1000,80).
attack(credential_prompt_impersonation, company-sector-hospital,65).
attack(credential_prompt_impersonation, company-sector-finance,84).
attack(credential_prompt_impersonation, company-sector-technology,80).
attack(credential_prompt_impersonation, company-sector-business-and-professional-service,76).
attack(credential_prompt_impersonation, company-sector-retail-and-manifacturing,55).
attack(credential_prompt_impersonation, company-sector-logistics-and-transportation,73).
attack(credential_prompt_impersonation, europe, 85).
attack(credential_prompt_impersonation, north-america, 94).
attack(credential_prompt_impersonation, south-america, 52).
attack(credential_prompt_impersonation, australia, 84).
attack(credential_prompt_impersonation, asia, 75).
attack(credential_prompt_impersonation, africa, 47).

%android-activity-hijack
attacksymptomslist(android_activity_hijack, [app_download,credentials_theft,suspicious_code_modifications]).

attack(android_activity_hijack, update, 34).
attack(android_activity_hijack, suspicious_conversation_phone_call, 1).
attack(android_activity_hijack, suspicious_conversation_phone_message, 8).
attack(android_activity_hijack, suspicious_conversation_email, 11).
attack(android_activity_hijack, suspicious_conversation_visit, 1).
attack(android_activity_hijack, app_download, 84).
attack(android_activity_hijack, ad_click, 17).
attack(android_activity_hijack, ad_blocker_deactivation, 21).
attack(android_activity_hijack, suspicious_link, 24).
attack(android_activity_hijack, pop_up_windows, 56).
attack(android_activity_hijack, credential_re_entering, 19).
attack(android_activity_hijack, credentials_theft, 100).
attack(android_activity_hijack, suspicious_code_modifications, 87).
attack(android_activity_hijack, frequents_spams, 52).
attack(android_activity_hijack, company-size-1-250,89).
attack(android_activity_hijack, company-size-250-500,81).
attack(android_activity_hijack, company-size-500-1000,78).
attack(android_activity_hijack, company-size-1000,83).
attack(android_activity_hijack, company-sector-hospital,55).
attack(android_activity_hijack, company-sector-finance,89).
attack(android_activity_hijack, company-sector-technology,88).
attack(android_activity_hijack, company-sector-business-and-professional-service,79).
attack(android_activity_hijack, company-sector-retail-and-manifacturing,63).
attack(android_activity_hijack, company-sector-logistics-and-transportation,71).
attack(android_activity_hijack, europe, 87).
attack(android_activity_hijack, north-america, 86).
attack(android_activity_hijack, south-america, 51).
attack(android_activity_hijack, australia, 83).
attack(android_activity_hijack, asia, 91).
attack(android_activity_hijack, africa, 55).

%tapjacking
attacksymptomslist(tapjacking, [pop_up_windows,app_download,ad_click,frequents_spams]).

attack(tapjacking, update, 68).
attack(tapjacking, suspicious_conversation_phone_call, 6).
attack(tapjacking, suspicious_conversation_phone_message, 2).
attack(tapjacking, suspicious_conversation_email, 34).
attack(tapjacking, suspicious_conversation_visit, 2).
attack(tapjacking, app_download, 99).
attack(tapjacking, ad_click, 72).
attack(tapjacking, ad_blocker_deactivation, 66).
attack(tapjacking, suspicious_link, 55).
attack(tapjacking, pop_up_windows, 82).
attack(tapjacking, credentials_theft, 59).
attack(tapjacking, suspicious_code_modifications, 42).
attack(tapjacking, frequents_spams, 74).
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
attacksymptomslist(malicious_manual_software_update, [update,suspicious_conversation-email,app_download, suspicious_link,frequents_spams]).

attack(malicious_manual_software_update, update, 100).
attack(malicious_manual_software_update, suspicious_conversation_phone_call, 5).
attack(malicious_manual_software_update, suspicious_conversation_phone_message, 4).
attack(malicious_manual_software_update, suspicious_conversation_email, 72).
attack(malicious_manual_software_update, suspicious_conversation_visit, 2).
attack(malicious_manual_software_update, app_download, 87).
attack(malicious_manual_software_update, ad_click, 12).
attack(malicious_manual_software_update, ad_blocker_deactivation, 16).
attack(malicious_manual_software_update, suspicious_link, 75).
attack(malicious_manual_software_update, pop_up_windows, 19).
attack(malicious_manual_software_update, credentials_theft, 20).
attack(malicious_manual_software_update, suspicious_code_modifications, 68).
attack(malicious_manual_software_update, frequents_spams, 73).
attack(malicious_manual_software_update, company-size-1-250,78).
attack(malicious_manual_software_update, company-size-250-500,85).
attack(malicious_manual_software_update, company-size-500-1000,73).
attack(malicious_manual_software_update, company-size-1000,83).
attack(malicious_manual_software_update, company-sector-hospital,65).
attack(malicious_manual_software_update, company-sector-finance,88).
attack(malicious_manual_software_update, company-sector-technology,81).
attack(malicious_manual_software_update, company-sector-business-and-professional-service,66).
attack(malicious_manual_software_update, company-sector-retail-and-manifacturing,58).
attack(malicious_manual_software_update, company-sector-logistics-and-transportation,73).
attack(malicious_manual_software_update, europe, 85).
attack(malicious_manual_software_update, north-america, 89).
attack(malicious_manual_software_update, south-america, 47).
attack(malicious_manual_software_update, australia, 84).
attack(malicious_manual_software_update, asia, 86).
attack(malicious_manual_software_update, africa, 33).

%rooting-sim-cards
attacksymptomslist(rooting_sim_cards, [update,suspicious_conversation_phone_message,credentials_theft]).

attack(rooting_sim_cards, update, 80).
attack(rooting_sim_cards, suspicious_conversation_phone_call, 54).
attack(rooting_sim_cards, suspicious_conversation_phone_message, 100).
attack(rooting_sim_cards, suspicious_conversation_email, 1).
attack(rooting_sim_cards, suspicious_conversation_visit, 2).
attack(rooting_sim_cards, app_download, 21).
attack(rooting_sim_cards, ad_click, 11).
attack(rooting_sim_cards, ad_blocker_deactivation, 13).
attack(rooting_sim_cards, suspicious_link, 33).
attack(rooting_sim_cards, pop_up_windows, 19).
attack(rooting_sim_cards, credentials_theft, 71).
attack(rooting_sim_cards, suspicious_code_modifications, 38).
attack(rooting_sim_cards, frequents_spams, 53).
attack(rooting_sim_cards, company-size-1-250,78).
attack(rooting_sim_cards, company-size-250-500,67).
attack(rooting_sim_cards, company-size-500-1000,73).
attack(rooting_sim_cards, company-size-1000,53).
attack(rooting_sim_cards, company-sector-hospital,65).
attack(rooting_sim_cards, company-sector-finance,88).
attack(rooting_sim_cards, company-sector-technology,94).
attack(rooting_sim_cards, company-sector-business-and-professional-service,66).
attack(rooting_sim_cards, company-sector-retail-and-manifacturing,55).
attack(rooting_sim_cards, company-sector-logistics-and-transportation,71).
attack(rooting_sim_cards, europe, 86).
attack(rooting_sim_cards, north-america, 90).
attack(rooting_sim_cards, south-america, 77).
attack(rooting_sim_cards, australia, 84).
attack(rooting_sim_cards, asia, 86).
attack(rooting_sim_cards, africa, 71).


%pretexting-via-tech-support
attacksymptomslist(pretexting_via_tech_support, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,suspicious_conversation_visit,pop_up_windows,credentials_theft]).

attack(pretexting_via_tech_support, suspicious_conversation_phone_call, 99).
attack(pretexting_via_tech_support, suspicious_conversation_phone_message, 98).
attack(pretexting_via_tech_support, suspicious_conversation_email, 86).
attack(pretexting_via_tech_support, suspicious_conversation_visit, 71).
attack(pretexting_via_tech_support, pop_up_windows, 82).
attack(pretexting_via_tech_support, credentials_theft, 83).
attack(pretexting_via_tech_support, company-size-1-250,92).
attack(pretexting_via_tech_support, company-size-250-500,87).
attack(pretexting_via_tech_support, company-size-500-1000,57).
attack(pretexting_via_tech_support, company-size-1000,75).
attack(pretexting_via_tech_support, company-sector-hospital,52).
attack(pretexting_via_tech_support, company-sector-finance,2).
attack(pretexting_via_tech_support, company-sector-technology,23).
attack(pretexting_via_tech_support, company-sector-business-and-professional-service,53).
attack(pretexting_via_tech_support, company-sector-retail-and-manifacturing,76).
attack(pretexting_via_tech_support, company-sector-logistics-and-transportation,23).
attack(pretexting_via_tech_support, europe, 35).
attack(pretexting_via_tech_support, north-america, 87).
attack(pretexting_via_tech_support, south-america, 12).
attack(pretexting_via_tech_support, australia, 93).
attack(pretexting_via_tech_support, asia, 75).
attack(pretexting_via_tech_support, africa, 7).



%pretexting-via-delivery-person
attacksymptomslist(pretexting_via_delivery_person, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_visit]).

attack(pretexting_via_delivery_person, suspicious_conversation_phone_call, 87).
attack(pretexting_via_delivery_person, suspicious_conversation_phone_message, 98).
attack(pretexting_via_delivery_person, suspicious_conversation_visit, 96).
attack(pretexting_via_delivery_person, company-size-1-250,92).
attack(pretexting_via_delivery_person, company-size-250-500,7).
attack(pretexting_via_delivery_person, company-size-500-1000,19).
attack(pretexting_via_delivery_person, company-size-1000,34).
attack(pretexting_via_delivery_person, company-sector-hospital,52).
attack(pretexting_via_delivery_person, company-sector-finance,2).
attack(pretexting_via_delivery_person, company-sector-technology,23).
attack(pretexting_via_delivery_person, company-sector-business-and-professional-service,53).
attack(pretexting_via_delivery_person, company-sector-retail-and-manifacturing,76).
attack(pretexting_via_delivery_person, company-sector-logistics-and-transportation,23).
attack(pretexting_via_delivery_person, europe, 35).
attack(pretexting_via_delivery_person, north-america, 87).
attack(pretexting_via_delivery_person, south-america, 12).
attack(pretexting_via_delivery_person, australia, 93).
attack(pretexting_via_delivery_person, asia, 75).
attack(pretexting_via_delivery_person, africa, 7).


%pretexting-via-phone
attacksymptomslist(pretexting_via_phone, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,credentials_theft]).

attack(pretexting_via_phone, suspicious_conversation_phone_call, 87).
attack(pretexting_via_phone, suspicious_conversation_phone_message, 98).
attack(pretexting_via_phone, credentials_theft, 83).
attack(pretexting_via_phone, company-size-1-250,92).
attack(pretexting_via_phone, company-size-250-500,87).
attack(pretexting_via_phone, company-size-500-1000,57).
attack(pretexting_via_phone, company-size-1000,75).
attack(pretexting_via_phone, company-sector-hospital,52).
attack(pretexting_via_phone, company-sector-finance,2).
attack(pretexting_via_phone, company-sector-technology,23).
attack(pretexting_via_phone, company-sector-business-and-professional-service,53).
attack(pretexting_via_phone, company-sector-retail-and-manifacturing,76).
attack(pretexting_via_phone, company-sector-logistics-and-transportation,23).
attack(pretexting_via_phone, europe, 35).
attack(pretexting_via_phone, north-america, 87).
attack(pretexting_via_phone, south-america, 12).
attack(pretexting_via_phone, australia, 93).
attack(pretexting_via_phone, asia, 75).
attack(pretexting_via_phone, africa, 7).


%influence-perception-of-reciprocation
attacksymptomslist(influence_perception_of_reciprocation, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,ad_click,pop_up_windows,credentials_theft]).

attack(influence_perception_of_reciprocation, suspicious_conversation_phone_call, 81).
attack(influence_perception_of_reciprocation, suspicious_conversation_phone_message, 80).
attack(influence_perception_of_reciprocation, suspicious_conversation_email, 72).
attack(influence_perception_of_reciprocation, ad_click, 76).
attack(influence_perception_of_reciprocation, pop_up_windows, 72).
attack(influence_perception_of_reciprocation, credentials_theft, 71).
attack(influence_perception_of_reciprocation, company-size-1-250,92).
attack(influence_perception_of_reciprocation, company-size-250-500,87).
attack(influence_perception_of_reciprocation, company-size-500-1000,57).
attack(influence_perception_of_reciprocation, company-size-1000,75).
attack(influence_perception_of_reciprocation, company-sector-hospital,52).
attack(influence_perception_of_reciprocation, company-sector-finance,2).
attack(influence_perception_of_reciprocation, company-sector-technology,23).
attack(influence_perception_of_reciprocation, company-sector-business-and-professional-service,53).
attack(influence_perception_of_reciprocation, company-sector-retail-and-manifacturing,76).
attack(influence_perception_of_reciprocation, company-sector-logistics-and-transportation,23).
attack(influence_perception_of_reciprocation, europe, 35).
attack(influence_perception_of_reciprocation, north-america, 87).
attack(influence_perception_of_reciprocation, south-america, 12).
attack(influence_perception_of_reciprocation, australia, 93).
attack(influence_perception_of_reciprocation, asia, 75).
attack(influence_perception_of_reciprocation, africa, 7).


%influence-perception-of-scarcity
attacksymptomslist(influence_perception_of_scarcity, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,ad_click,pop_up_windows,credentials_theft]).

attack(influence_perception_of_scarcity, suspicious_conversation_phone_call, 90).
attack(influence_perception_of_scarcity, suspicious_conversation_phone_message, 98).
attack(influence_perception_of_scarcity, suspicious_conversation_email, 76).
attack(influence_perception_of_scarcity, ad_click, 87).
attack(influence_perception_of_scarcity, pop_up_windows, 90).
attack(influence_perception_of_scarcity, credentials_theft, 83).
attack(influence_perception_of_scarcity, company-size-1-250,92).
attack(influence_perception_of_scarcity, company-size-250-500,87).
attack(influence_perception_of_scarcity, company-size-500-1000,57).
attack(influence_perception_of_scarcity, company-size-1000,75).
attack(influence_perception_of_scarcity, company-sector-hospital,52).
attack(influence_perception_of_scarcity, company-sector-finance,2).
attack(influence_perception_of_scarcity, company-sector-technology,23).
attack(influence_perception_of_scarcity, company-sector-business-and-professional-service,53).
attack(influence_perception_of_scarcity, company-sector-retail-and-manifacturing,76).
attack(influence_perception_of_scarcity, company-sector-logistics-and-transportation,23).
attack(influence_perception_of_scarcity, europe, 35).
attack(influence_perception_of_scarcity, north-america, 87).
attack(influence_perception_of_scarcity, south-america, 12).
attack(influence_perception_of_scarcity, australia, 93).
attack(influence_perception_of_scarcity, asia, 75).
attack(influence_perception_of_scarcity, africa, 7).


%influence-perception-of-authority
attacksymptomslist(influence_perception_of_authority, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,ad_click,pop_up_windows,credentials_theft]).

attack(influence_perception_of_authority, suspicious_conversation_phone_call, 77).
attack(influence_perception_of_authority, suspicious_conversation_phone_message, 91).
attack(influence_perception_of_authority, suspicious_conversation_email, 94).
attack(influence_perception_of_authority, ad_click, 72).
attack(influence_perception_of_authority, pop_up_windows, 83).
attack(influence_perception_of_authority, credentials_theft, 84).
attack(influence_perception_of_authority, company-size-1-250,92).
attack(influence_perception_of_authority, company-size-250-500,87).
attack(influence_perception_of_authority, company-size-500-1000,57).
attack(influence_perception_of_authority, company-size-1000,75).
attack(influence_perception_of_authority, company-sector-hospital,52).
attack(influence_perception_of_authority, company-sector-finance,2).
attack(influence_perception_of_authority, company-sector-technology,23).
attack(influence_perception_of_authority, company-sector-business-and-professional-service,53).
attack(influence_perception_of_authority, company-sector-retail-and-manifacturing,76).
attack(influence_perception_of_authority, company-sector-logistics-and-transportation,23).
attack(influence_perception_of_authority, europe, 35).
attack(influence_perception_of_authority, north-america, 87).
attack(influence_perception_of_authority, south-america, 12).
attack(influence_perception_of_authority, australia, 93).
attack(influence_perception_of_authority, asia, 75).
attack(influence_perception_of_authority, africa, 7).


%influence-perception-of-liking
attacksymptomslist(influence_perception_of_liking, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,suspicious_conversation_visit,credentials_theft]).

attack(influence_perception_of_liking, suspicious_conversation_phone-call, 89).
attack(influence_perception_of_liking, suspicious_conversation_phone-message, 71).
attack(influence_perception_of_liking, suspicious_conversation_email, 72).
attack(influence_perception_of_liking, suspicious_conversation_visit, 77).
attack(influence_perception_of_liking, credentials_theft, 70).
attack(influence_perception_of_liking, company-size-1-250,92).
attack(influence_perception_of_liking, company-size-250-500,87).
attack(influence_perception_of_liking, company-size-500-1000,57).
attack(influence_perception_of_liking, company-size-1000,75).
attack(influence_perception_of_liking, company-sector-hospital,52).
attack(influence_perception_of_liking, company-sector-finance,2).
attack(influence_perception_of_liking, company-sector-technology,23).
attack(influence_perception_of_liking, company-sector-business-and-professional-service,53).
attack(influence_perception_of_liking, company-sector-retail-and-manifacturing,76).
attack(influence_perception_of_liking, company-sector-logistics-and-transportation,23).
attack(influence_perception_of_liking, europe, 35).
attack(influence_perception_of_liking, north-america, 87).
attack(influence_perception_of_liking, south-america, 12).
attack(influence_perception_of_liking, australia, 93).
attack(influence_perception_of_liking, asia, 75).
attack(influence_perception_of_liking, africa, 7).


%influence-perception-of-consensus-or-social-proof
attacksymptomslist(influence_perception_of_consensus_or_social_proof, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,ad_click,pop_up_windows,credentials_theft]).

attack(influence_perception_of_consensus_or_social_proof, suspicious_conversation_phone_call, 77).
attack(influence_perception_of_consensus_or_social_proof, suspicious_conversation_phone_message, 78).
attack(influence_perception_of_consensus_or_social_proof, suspicious_conversation_email, 86).
attack(influence_perception_of_consensus_or_social_proof, ad_click, 71).
attack(influence_perception_of_consensus_or_social_proof, pop_up_windows, 82).
attack(influence_perception_of_consensus_or_social_proof, credentials_theft, 83).
attack(influence_perception_of_consensus_or_social_proof, company-size-1-250,92).
attack(influence_perception_of_consensus_or_social_proof, company-size-250-500,87).
attack(influence_perception_of_consensus_or_social_proof, company-size-500-1000,57).
attack(influence_perception_of_consensus_or_social_proof, company-size-1000,75).
attack(influence_perception_of_consensus_or_social_proof, company-sector-hospital,52).
attack(influence_perception_of_consensus_or_social_proof, company-sector-finance,2).
attack(influence_perception_of_consensus_or_social_proof, company-sector-technology,23).
attack(influence_perception_of_consensus_or_social_proof, company-sector-business-and-professional-service,53).
attack(influence_perception_of_consensus_or_social_proof, company-sector-retail-and-manifacturing,76).
attack(influence_perception_of_consensus_or_social_proof, company-sector-logistics-and-transportation,23).
attack(influence_perception_of_consensus_or_social_proof, europe, 35).
attack(influence_perception_of_consensus_or_social_proof, north-america, 87).
attack(influence_perception_of_consensus_or_social_proof, south-america, 12).
attack(influence_perception_of_consensus_or_social_proof, australia, 93).
attack(influence_perception_of_consensus_or_social_proof, asia, 75).
attack(influence_perception_of_consensus_or_social_proof, africa, 7).


%target-influence-via-framing
attacksymptomslist(target_influence_via_framing, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,ad_click,pop_up_windows,credentials_theft]).

attack(target_influence_via_framing, suspicious_conversation_phone_call, 83).
attack(target_influence_via_framing, suspicious_conversation_phone_message, 98).
attack(target_influence_via_framing, suspicious_conversation_email, 72).
attack(target_influence_via_framing, ad_click, 84).
attack(target_influence_via_framing, pop_up_windows, 81).
attack(target_influence_via_framing, credentials_theft, 83).
attack(target_influence_via_framing, company-size-1-250,92).
attack(target_influence_via_framing, company-size-250-500,87).
attack(target_influence_via_framing, company-size-500-1000,57).
attack(target_influence_via_framing, company-size-1000,75).
attack(target_influence_via_framing, company-sector-hospital,52).
attack(target_influence_via_framing, company-sector-finance,2).
attack(target_influence_via_framing, company-sector-technology,23).
attack(target_influence_via_framing, company-sector-business-and-professional-service,53).
attack(target_influence_via_framing, company-sector-retail-and-manifacturing,76).
attack(target_influence_via_framing, company-sector-logistics-and-transportation,23).
attack(target_influence_via_framing, europe, 35).
attack(target_influence_via_framing, north-america, 87).
attack(target_influence_via_framing, south-america, 12).
attack(target_influence_via_framing, australia, 93).
attack(target_influence_via_framing, asia, 75).
attack(target_influence_via_framing, africa, 7).


%influence-via-modes-of-thinking
attacksymptomslist(influence_via_modes_of_thinking, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_visit,credentials_theft]).

attack(influence_via_modes_of_thinking, suspicious_conversation_phone_call, 82).
attack(influence_via_modes_of_thinking, suspicious_conversation_phone_message, 88).
attack(influence_via_modes_of_thinking, suspicious_conversation_visit, 74).
attack(influence_via_modes_of_thinking, credentials_theft, 78).
attack(influence_via_modes_of_thinking, company-size-1-250,92).
attack(influence_via_modes_of_thinking, company-size-250-500,87).
attack(influence_via_modes_of_thinking, company-size-500-1000,57).
attack(influence_via_modes_of_thinking, company-size-1000,75).
attack(influence_via_modes_of_thinking, company-sector-hospital,52).
attack(influence_via_modes_of_thinking, company-sector-finance,2).
attack(influence_via_modes_of_thinking, company-sector-technology,23).
attack(influence_via_modes_of_thinking, company-sector-business-and-professional-service,53).
attack(influence_via_modes_of_thinking, company-sector-retail-and-manifacturing,76).
attack(influence_via_modes_of_thinking, company-sector-logistics-and-transportation,23).
attack(influence_via_modes_of_thinking, europe, 35).
attack(influence_via_modes_of_thinking, north-america, 87).
attack(influence_via_modes_of_thinking, south-america, 12).
attack(influence_via_modes_of_thinking, australia, 93).
attack(influence_via_modes_of_thinking, asia, 75).
attack(influence_via_modes_of_thinking, africa, 7).



%target-influence-via-interview-and-interrogation
attacksymptomslist(target_influence_via_interview_and_interrogation, [suspicious_conversation_phone_call,suspicious_conversation_phone_message,suspicious_conversation_email,ad_click,pop_up_windows]).

attack(target_influence_via_interview_and_interrogation, suspicious_conversation_phone_call, 90).
attack(target_influence_via_interview_and_interrogation, suspicious_conversation_phone_message, 73).
attack(target_influence_via_interview_and_interrogation, suspicious_conversation_email, 78).
attack(target_influence_via_interview_and_interrogation, ad_click, 81).
attack(target_influence_via_interview_and_interrogation, pop_up_windows, 76).
attack(target_influence_via_interview_and_interrogation, company-size-1-250,92).
attack(target_influence_via_interview_and_interrogation, company-size-250-500,87).
attack(target_influence_via_interview_and_interrogation, company-size-500-1000,57).
attack(target_influence_via_interview_and_interrogation, company-size-1000,75).
attack(target_influence_via_interview_and_interrogation, company-sector-hospital,52).
attack(target_influence_via_interview_and_interrogation, company-sector-finance,2).
attack(target_influence_via_interview_and_interrogation, company-sector-technology,23).
attack(target_influence_via_interview_and_interrogation, company-sector-business-and-professional-service,53).
attack(target_influence_via_interview_and_interrogation, company-sector-retail-and-manifacturing,76).
attack(target_influence_via_interview_and_interrogation, company-sector-logistics-and-transportation,23).
attack(target_influence_via_interview_and_interrogation, europe, 35).
attack(target_influence_via_interview_and_interrogation, north-america, 87).
attack(target_influence_via_interview_and_interrogation, south-america, 12).
attack(target_influence_via_interview_and_interrogation, australia, 93).
attack(target_influence_via_interview_and_interrogation, asia, 75).
attack(target_influence_via_interview_and_interrogation, africa, 7).




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
possible_attacks_list(S1,A1) :- findall(X, possible_attack_by_symptoms(S1,X), A1).

countermeasures(A,L) :- findall(X, countermeasure(A,X,V),L).
countermeasures_sorted(A,L) :- findall([V,X], countermeasure(A,X,V), L1),sort(L1,L).