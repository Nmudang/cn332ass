import logging

class LoggingFile():
	def __init__(self):
		self.log = logging
		self.log.basicConfig(filename='logfile.log', encoding='utf-8', level=logging.DEBUG,format='%(asctime)s %(message)s')
		self.log.debug('Start logfile')

	def wirte(self,content):
		self.log.info(" : "+content)


