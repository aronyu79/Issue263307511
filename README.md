# Issue263307511

To debug run e.g.
`gradlew.bat build`
and open folder in Android Studio.

To reproduce Issue [263307511](https://issuetracker.google.com/issues/263307511):
Make sure you have "Show Background ANR" enabled on your Android phone.

1) Start application
2) Tap a couple of times in the application
3) Move application to background by e.g. switching to home screen
4) Wait about 3-4 seconds
5) Re-open application, notice it has hanged
6) Tap a couple of times in the application
7) Wait until the application starts rendering again
8) Wait a couple of seconds and the Android ANR dialog pops up
9) The dialog keeps popping up even tho the application is responsive

See video.mp4 for a repro case
