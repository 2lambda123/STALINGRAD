(letrec ((even? (lambda (n)
		 (cond ((= n 0) #t) ((= n 1) #f) (else (odd? (- n 1))))))
	 (odd? (lambda (n)
		(cond ((= n 0) #f) ((= n 1) #t) (else (even? (- n 1)))))))
 (odd? 3))
