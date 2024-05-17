This project is a Google Cloud Deployment of the URL Shortener Project.

The architecture diagram created for this project illustrates the steps for achieving this. 
![image](https://github.com/JessHoey/url-shortener-project/assets/95666605/a15c8d83-d102-47a6-a645-87600c5818e8)

The base project we were tasked with deploying was the URL-Shortener previously developed for onboarding to my company. 
The tech stack used was Java, PostgreSQL and Springboot for this deployment project which has not changed. 

The URL-Shortener project is based on creating a service similar to https://www.tinyurl.com/ or https://bitly.com/ 
. The premise of this is that a user will take a URL and paste it into the service which would then return a shortened URL. This also works the opposite way where if a shortener URL was inputted then it would return the original URL. 
Due to having no front-end developed for this project, our team achieved this through Postman alone. 

The deployment of this project uses multiple services provided by the Google Cloud Platform. 
The local database needed to be connected to Cloud SQL and a local docker container needed to be tagged and pushed to Artifact Registry.
Any changes which are pushed to the master (main) branch would trigger the build, this was achieved through using Cloud Build Trigger. 
Then once the project was built it would then deploy on Cloud Run. 


