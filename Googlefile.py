from __future__ import print_function
import os.path
from googleapiclient.discovery import build
from google_auth_oauthlib.flow import InstalledAppFlow
from google.auth.transport.requests import Request
from google.oauth2.credentials import Credentials
import time 

class Googlefile():
	SAMPLE_RANGE_NAME = 'A1'

	## แก้ SAMPLE_SPREADSHEET_ID เป็นของตัวเอง แล้วก็ไปลบไฟล์ token.json
	def __init__(self,SAMPLE_SPREADSHEET_ID='1oeZQIZ1pTyh-fStiQkbYjt7LXNXUbtRQui6nML_ZKGE'):
		SCOPES = ['https://www.googleapis.com/auth/spreadsheets'] 
		self.SAMPLE_SPREADSHEET_ID = SAMPLE_SPREADSHEET_ID
		creds = None
		if os.path.exists('token.json'):
			creds = Credentials.from_authorized_user_file('token.json', SCOPES)
		if not creds or not creds.valid:

			if creds and creds.expired and creds.refresh_token:
				creds.refresh(Request())
			else:
				flow = InstalledAppFlow.from_client_secrets_file(
                'credentials.json', SCOPES)
				creds = flow.run_local_server(port=0)
        # Save the credentials for the next run
			with open('token.json', 'w') as token:
				token.write(creds.to_json())
		service = build('sheets', 'v4', credentials=creds)
		self.sheet = service.spreadsheets()
		local_time = time.ctime(time.time())
		values = [['date', 'event'],[local_time,'Start create Customer']]
		body = {'range': self.SAMPLE_RANGE_NAME, 'values': values, 'majorDimension': 'ROWS'}
		request = self.sheet.values().append(spreadsheetId=self.SAMPLE_SPREADSHEET_ID, range=self.SAMPLE_RANGE_NAME, valueInputOption='USER_ENTERED',body=body).execute()

	def wirte(self,content):
		local_time = time.ctime(time.time())
		values = [[local_time, content]]
		body = {'range': self.SAMPLE_RANGE_NAME, 
    	'values': values, 
    	'majorDimension': 'ROWS'}
		request = self.sheet.values().append(spreadsheetId=self.SAMPLE_SPREADSHEET_ID, range=self.SAMPLE_RANGE_NAME, valueInputOption='USER_ENTERED',body=body).execute()

