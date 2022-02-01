package fr.esir.mdi.ci.tpmaven;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FirstPdfTest{

	@Test
	void testMain() throws IOException {
		String[] args = null;
		File tempFile = new File("FirstPdf.pdf");
		FirstPdf.main(args);
		assertTrue(tempFile.exists());
	}
}
