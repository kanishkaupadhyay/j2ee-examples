<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compound Interest Calculator</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-slate-200">
		<div
			class="mx-auto my-96 w-1/2 max-w-2xl rounded-3xl bg-white py-5 shadow-xl">
			<h2 class="mx-6 border-b-2 pb-2 text-center text-4xl font-semibold">Compound
				Interest Calculator</h2>
			<h3
				class="mx-auto my-2 w-80 bg-red-400 text-center rounded-lg text-xl font-semibold text-red-800">${error}</h3>
			<form action="/CompoundInterestCalculator/calculate" method="post">
				<div class="overflow- my-5 mx-8 grid grid-cols-2 gap-4">
					<label for="principalAmount" class="flex items-center text-xl">Principle
						Amount <span class="mx-1 text-gray-500">$</span>
					</label> <input
						class="w-full appearance-none rounded-xl border-2 border-cyan-600 p-1 placeholder-cyan-700 focus:outline-none"
						type="number" id="principleAmount" name="principalAmount"
		 				value="${principal}" /> <label for="interestRate"
						class="flex items-center text-xl">Interest Rate
						(Percentage)</label> <input
						class="w-full appearance-none rounded-xl border-2 border-cyan-600 p-1 placeholder-cyan-700 focus:outline-none"
						type="number" id="interestRate" min="1" max="100"
						name="interestRate" value="${interest}" /> <label for="years"
						class="flex items-center text-xl">Years</label> <input
						class="w-full appearance-none rounded-xl border-2 border-cyan-600 p-1 placeholder-cyan-700 focus:outline-none"
						type="number" id="years" min="1" name="years" value="${years}" />

					<label for="timesPerYear" class="flex items-center text-xl">Times
						per year (1 to 12)</label> <input
						class="w-full appearance-none rounded-xl border-2 border-cyan-600 p-1 placeholder-cyan-700 focus:outline-none"
						type="number" id="timesPerYear" min="1" max="12"
						name="timesPerYear" value="${compoundingRate}" />
				</div>
				<div class="w-full text-center">
					<button
						class="mx-auto rounded-xl bg-cyan-900 px-4 py-1 text-xl font-semibold text-white hover:bg-cyan-700"
						type="submit" id="calculate">Calculate</button>
					<p id="" class="font-mono text-xl text-green-800">Result:
						${result}</p>
				</div>
			</form>
		</div>
</body>
</html>