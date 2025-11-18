# Biggan Coaching Center

This project scaffold is prepared for you (Kotlin + Room + Firestore placeholders).
Upload the entire contents of this folder to your GitHub repository (Create new repo -> Upload files).
After commit, go to Actions -> Android Build -> run the workflow (or wait for push) to generate app-debug.apk.

## IMPORTANT - Firebase setup
1. Create a Firebase project at https://console.firebase.google.com/
2. Add an Android app (package name: com.vigyan.coaching)
3. Download `google-services.json` and place it into `app/` before building.
4. If you want Authentication, enable Email/Password or Anonymous in Firebase Console.

## How to get APK (mobile-friendly)
1. Upload all files to a new GitHub repo (use Desktop site in browser if upload option not visible).
2. Commit. Go to Actions tab. Run **Android Build** workflow or wait for it to trigger on push to `main`.
3. After success: Actions -> latest run -> Artifacts -> download `app-debug-apk`.

## What I included
- Kotlin Android scaffold (MainActivity, AdminActivity)
- Room entities and DAOs (Student entity includes guardianName and joinDate)
- Repository with simple Firestore sync placeholders (you must add google-services.json)
- WorkManager SyncWorker scaffold
- GitHub Actions workflow to assembleDebug and upload APK artifact

If you want, I can now:
- (A) Upload this project to your GitHub repo if you give me the repo URL and make it public
- (B) Or you upload files yourself and ask me to help running Actions

Tell me which you'd like.
