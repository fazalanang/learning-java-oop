package Matajari.Mitra.Solusi.Data;

class SocialMedia {
    String name;
}
//final class
final class Facebook extends SocialMedia {

}
/*class FakeFacebook extends Facebook {
    [ERROR karena Facebook sdh final]
}*/

//final method
class Instagram extends SocialMedia {
    final void Login (String userName, String password) {
        // isi method
    }
}
class fakeInstagram extends Instagram {
    /*void Login (String userName, String password) {
        [ERROR karena instagram sdh final void]
    }*/
}

