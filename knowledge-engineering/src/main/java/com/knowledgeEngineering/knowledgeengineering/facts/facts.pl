%napadi i simptomi i ucestalost njihovog koriscenja-----------------------------

%cross-site-flashing
attack(cross-site-flashing, update, 23).
attack(cross-site-flashing, suspicious-conversation-phone-call, 54).
attack(cross-site-flashing, suspicious-conversation-phone-message, 75).
attack(cross-site-flashing, suspicious-conversation-email, 12).
attack(cross-site-flashing, suspicious-conversation-visit, 33).
attack(cross-site-flashing, app-download, 87).
attack(cross-site-flashing, ad-click, 12).
attack(cross-site-flashing, ad-blocker-deactivation, 3).
attack(cross-site-flashing, suspicious-link, 54).
attack(cross-site-flashing, pop-up-windows, 58).
attack(cross-site-flashing, credential-re-entering, 95).
attack(cross-site-flashing, services-fail, 12).
attack(cross-site-flashing, credentials-theft, 45).
attack(cross-site-flashing, suspicious-code-modifications, 86).
attack(cross-site-flashing, frequents-spams, 86).
attack(cross-site-flashing, company-size-1-250,42).
attack(cross-site-flashing, company-size-250-500,76).
attack(cross-site-flashing, company-size-500-1000,24).
attack(cross-site-flashing, company-size-1000+,89).
attack(cross-site-flashing, company-sector-hospital,12).
attack(cross-site-flashing, company-sector-finance,66).
attack(cross-site-flashing, company-sector-technology,43).
attack(cross-site-flashing, company-sector-business-and-professional-service,6).
attack(cross-site-flashing, company-sector-retail-and-manifacturing,62).
attack(cross-site-flashing, company-sector-logistics-and-transportation,85).
attack(cross-site-flashing, europe, 35).
attack(cross-site-flashing, north-america, 87).
attack(cross-site-flashing, south-america, 12).
attack(cross-site-flashing, australia, 93).
attack(cross-site-flashing, asia, 75).
attack(cross-site-flashing, africa, 7).


%pretexting-via-customer-service
attack(pretexting-via-customer-service, update, 13).
attack(pretexting-via-customer-service, suspicious-conversation-phone-call, 87).
attack(pretexting-via-customer-service, suspicious-conversation-phone-message, 98).
attack(pretexting-via-customer-service, suspicious-conversation-email, 66).
attack(pretexting-via-customer-service, suspicious-conversation-visit, 2).
attack(pretexting-via-customer-service, app-download, 17).
attack(pretexting-via-customer-service, ad-click, 86).
attack(pretexting-via-customer-service, ad-blocker-deactivation, 57).
attack(pretexting-via-customer-service, suspicious-link, 23).
attack(pretexting-via-customer-service, pop-up-windows, 82).
attack(pretexting-via-customer-service, credential-re-entering, 67).
attack(pretexting-via-customer-service, services-fail, 13).
attack(pretexting-via-customer-service, credentials-theft, 83).
attack(pretexting-via-customer-service, suspicious-code-modifications, 53).
attack(pretexting-via-customer-service, frequents-spams, 43).
attack(pretexting-via-customer-service, company-size-1-250,92).
attack(pretexting-via-customer-service, company-size-250-500,87).
attack(pretexting-via-customer-service, company-size-500-1000,57).
attack(pretexting-via-customer-service, company-size-1000+,75).
attack(pretexting-via-customer-service, company-sector-hospital,52).
attack(pretexting-via-customer-service, company-sector-finance,2).
attack(pretexting-via-customer-service, company-sector-technology,23).
attack(pretexting-via-customer-service, company-sector-business-and-professional-service,53).
attack(pretexting-via-customer-service, company-sector-retail-and-manifacturing,76).
attack(pretexting-via-customer-service, company-sector-logistics-and-transportation,23).
attack(cross-site-flashing, europe, 35).
attack(cross-site-flashing, north-america, 87).
attack(cross-site-flashing, south-america, 12).
attack(cross-site-flashing, australia, 93).
attack(cross-site-flashing, asia, 75).
attack(cross-site-flashing, africa, 7).

%mere zastite----------------------------------------------------------------------


%cross-site-flashing
countermeasure(cross-site-flashing, only-click-on-familiar-links,89).
countermeasure(cross-site-flashing, cross-domain-xml-configuration,75).

%pretexting-via-customer-service
countermeasure(pretexting-via-customer-service, validate-phone-number, 95).
countermeasure(pretexting-via-customer-service, employee-education,47).


