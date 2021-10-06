package za.ac.nwu.acnew.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.acnew.domain.service.GeneralResponse;

@RestController
//@RequestMapping("account-type")
public class AccountTypeController {

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Account types", notes = "Returns a list of Account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account type was returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<String>> getAll(){GeneralResponse<String> response = new GeneralResponse<> (true, "No types found");
    return new ResponseEntity<>(response, HttpStatus.OK);}

    //public GeneralResponse<String> getAll(){return new GeneralResponse<String>(true, "No types found");}


}
