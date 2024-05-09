package io.ana.julia.listinha.controller;

import io.ana.julia.listinha.data.dto.ShoppingListDto;
import io.ana.julia.listinha.data.dto.UserDto;
import io.ana.julia.listinha.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDTO) {
        UserDto createUserDto = userService.createUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createUserDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDTO) {
        UserDto updateUserDto = userService.updateUser(userDTO);
        return ResponseEntity.status(HttpStatus.OK).body(updateUserDto);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> findAllUsers() {
        List<UserDto> findAllUsersDto = userService.findAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(findAllUsersDto);
    }

    @GetMapping("/{id}/shopping-lists")
    public ResponseEntity<List<ShoppingListDto>> getShoppingListByUser(
            @PathVariable("id") Long id) {
        List<ShoppingListDto> getListById = userService.getListsById(id);
        return ResponseEntity.status(HttpStatus.OK).body(getListById);
    }
}
