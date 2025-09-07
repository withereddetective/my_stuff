from pytube import YouTube

def Download(link):
    try:
        YouTube(link).streams.first().download()
    except:
        print("An error has occurred")
        exit('5')
    youtubeObject = YouTube(link)
    youtubeObject = youtubeObject.streams.get_highest_resolution()
    print("Download is completed successfully")


link = input("Enter the YouTube video URL: ")
Download(link)