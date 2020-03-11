package com.ms1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms1.document.Geo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("FAB-GEO Restful APIs")
@RestController
@RequestMapping("/test")
public class TestController {



	@ApiOperation(value = "To get all locations", response = Geo.class)
	@GetMapping("/list")
	public ResponseEntity<List<Geo>> getCreditCardInfo() {
		
		
		
		List<Geo> list = new ArrayList<Geo>();
		
		Geo geo1 = new Geo();
		geo1.setId("1");
		geo1.setLocationName("DL");
		
		Geo geo2 = new Geo();
		geo2.setId("2");
		geo2.setLocationName("BJ");
		
		list.add(geo1);
		list.add(geo2);

		return ResponseEntity.ok(list);
	}

//	@ApiOperation(value = "Get location by id", response = Geo.class)
//	@GetMapping("/location/{id}")
//	public Optional<Geo> getapplicantById(@PathVariable String id) throws Exception {
//		Optional<Geo> cc = geoRepository.findById(id);
//		if (!cc.isPresent()) {
//			LOGGER.info("geo  Id not found");
//			throw new ResourceNotFoundException("geo  Info Records not found");
//		}
//		return cc;
//
//	}

//	@ApiOperation(value = "delete location by id")
//	@DeleteMapping("/geo/delete/{id}")
//	public void deleteApplicantByID(@PathVariable String id) {
//		Optional<Geo> cc = geoRepository.findById(id);
//		if (!cc.isPresent()) {
//			LOGGER.info("geo  Info Records not found");
//			throw new ResourceNotFoundException("geo  Info Records not found");
//		}
//		geoRepository.deleteById(id);
//
//	}
//
//	@ApiOperation(value = "To location by id")
//	@PostMapping("/locations")
//	public ResponseEntity<Geo> createApplicant(@Valid @RequestBody Geo cc) {
//		Geo creditCard = (Geo) geoRepository.save(cc);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(creditCard.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
//	}

}
