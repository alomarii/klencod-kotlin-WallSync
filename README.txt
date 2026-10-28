طريقة التشغيل (مرة واحدة):
1) افتح موقع Firebase Console وأنشئ مشروعاً، ثم Build > Realtime Database > Create Database.
2) من تبويب Rules ضع القواعد التالية واضغط Publish:
   { "rules": { "wp": { ".read": true, ".write": true } } }
3) انسخ رابط قاعدة البيانات (يبدأ بـ https:// وينتهي بـ firebaseio.com).
4) افتح مجلد المشروع في Android Studio ثم Build > Build APK(s) وثبّت الملف على الهاتفين.
5) في التطبيق على الهاتفين: الصق نفس الرابط ونفس رمز الربط ثم اضغط "حفظ وتشغيل المزامنة".
