package za.ac.cput.library_management.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.library_management.api.MemberAPI;


@RestController
@RequestMapping("/member")
public class MemberController {

    private MemberAPI memberAPI;

    @Autowired MemberController (MemberAPI memberAPI){

        this.memberAPI = memberAPI;
    }

}
